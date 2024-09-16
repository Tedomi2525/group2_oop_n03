package com.finalproj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.finalproj.model.Admin;
import java.sql.Date;
import java.time.LocalDate;

public class UserDao {
    
    public List<Admin> getAllUsers() {
        List<Admin> users = new ArrayList<>();
        
        String sql = "SELECT * FROM ADMINS";
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery()) {
            
            while (rs.next()) {
                Admin user = new Admin();
                
                user.setCode_admin(rs.getString("CODE_ADMIN"));
                user.setFull_name(rs.getString("FULL_NAME"));
                Date sqlDate = rs.getDate("BIRTHDAY");
                LocalDate birthday = sqlDate != null ? sqlDate.toLocalDate() : null;
                user.setBirthday(birthday);
                user.setEmail(rs.getString("EMAIL"));
                user.setGender(rs.getString("GENDER"));
                user.setUsername(rs.getString("USERNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return users;
    }
    
    public void addUser(Admin user) {
        String sql = "INSERT INTO ADMINS (CODE_ADMIN, FULL_NAME, BIRTHDAY, EMAIL, GENDER, USERNAME, PASSWORD) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.setString(1, user.getCode_admin());
            preparedStatement.setString(2, user.getFull_name());


            LocalDate birthday = user.getBirthday();
            if (birthday != null) {
                preparedStatement.setDate(3, Date.valueOf(birthday)); 
            } else {
                preparedStatement.setNull(3, java.sql.Types.DATE);  
            }

            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getGender());
            preparedStatement.setString(6, user.getUsername());
            preparedStatement.setString(7, user.getPassword());
            
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void updateUser(Admin user) {
        String sql = "UPDATE ADMINS SET CODE_ADMIN = ?, FULL_NAME = ?, BIRTHDAY = ?, EMAIL = ?, GENDER = ?, USERNAME = ?, PASSWORD = ?";
        
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.setString(1, user.getFull_name());

            // Xử lý ngày sinh (birthday)
            if (user.getBirthday() == null) {
                throw new IllegalArgumentException("Birthday cannot be null, since it is a NOT NULL field in the database.");
            } else {
                preparedStatement.setDate(2, Date.valueOf(user.getBirthday()));
            }
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setString(5, user.getUsername());
            preparedStatement.setString(6, user.getPassword());
            
            preparedStatement.setString(7, user.getCode_admin());
            
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUser(String code_admin) {
        String sql = "DELETE FROM ADMINS WHERE CODE_ADMIN = ?";
        
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.setString(1, code_admin);
            
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Admin getUserByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM ADMINS WHERE USERNAME = ? AND PASSWORD = ?";
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    Admin user = new Admin();
                    user.setCode_admin(rs.getString("CODE_ADMIN"));
                    user.setFull_name(rs.getString("FULL_NAME"));
                    user.setBirthday(rs.getDate("BIRTHDAY").toLocalDate());
                    user.setEmail(rs.getString("EMAIL"));
                    user.setGender(rs.getString("GENDER"));
                    user.setUsername(rs.getString("USERNAME"));
                    user.setPassword(rs.getString("PASSWORD"));
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

