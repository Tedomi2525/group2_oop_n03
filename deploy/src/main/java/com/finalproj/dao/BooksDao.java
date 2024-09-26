package com.finalproj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.finalproj.model.Books;

public class BooksDao extends HttpServlet {

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        
        String sql = "SELECT * FROM SACH";
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                Books book = new Books();

                book.setMaSach(rs.getString("MaSach"));
                book.setTenSach(rs.getString("TenSach"));
                book.setTacGia(rs.getString("TacGia"));
                book.setTheLoai(rs.getString("TheLoai"));
                book.setSoluongtong(rs.getInt("SoLuongTong"));
                book.setSoluongmuon(rs.getInt("SoLuongMuon"));
                book.setSoluongcon(rs.getInt("SoLuongCon"));

                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books; 
    }

    public void addBook(Books book) {
        if (book.getSoluongtong() > 0) {
            String sql = "INSERT INTO Sach (MaSach, TenSach, TacGia, TheLoai, SoLuongTong, SoLuongMuon, SoLuongCon) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (Connection connection = JDBCConnection.getJDBConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, book.getMaSach());
                preparedStatement.setString(2, book.getTenSach());
                preparedStatement.setString(3, book.getTacGia());
                preparedStatement.setString(4, book.getTheLoai());
                preparedStatement.setInt(5, book.getSoluongtong());
                preparedStatement.setInt(6, book.getSoluongmuon());
                preparedStatement.setInt(7, book.getSoluongcon());

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Số dòng được tạo trong MySQL: " + rowsAffected);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Dữ liệu không hợp lệ. Không thể thêm sách.");
        }
    }

    public boolean isBookExists(String maSach) {
        boolean exists = false;
        String sql = "SELECT COUNT(*) FROM Sach WHERE MaSach = ?";
        
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.setString(1, maSach);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next()) {
                int count = rs.getInt(1);
                exists = count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return exists;
    }
    
    public void updateBook(Books book) {
        if (book.getSoluongtong() > 0) {
            int soLuongCon = book.getSoluongtong() - book.getSoluongmuon();
            
            String sql = "UPDATE Sach SET TenSach = ?, TacGia = ?, TheLoai = ?, SoLuongTong = ?, SoLuongCon = ? WHERE MaSach = ?";

            try (Connection connection = JDBCConnection.getJDBConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, book.getTenSach());
                preparedStatement.setString(2, book.getTacGia());
                preparedStatement.setString(3, book.getTheLoai());
                preparedStatement.setInt(4, book.getSoluongtong());
                preparedStatement.setInt(5, soLuongCon);  
                preparedStatement.setString(6, book.getMaSach());

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Số dòng được cập nhật trong MySQL: " + rowsAffected);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Dữ liệu không hợp lệ. Không thể cập nhật sách.");
        }
    }


    public Books getBookById(String maSach) {
        Books book = null;
        String sql = "SELECT * FROM Sach WHERE MaSach = ?";
        
        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
            preparedStatement.setString(1, maSach);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next()) {
                book = new Books();
                book.setMaSach(rs.getString("MaSach"));
                book.setTenSach(rs.getString("TenSach"));
                book.setTacGia(rs.getString("TacGia"));
                book.setTheLoai(rs.getString("TheLoai"));
                book.setSoluongtong(rs.getInt("SoLuongTong"));
                book.setSoluongmuon(rs.getInt("SoLuongMuon"));
                book.setSoluongcon(rs.getInt("SoLuongCon"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return book;
    }
    
    public void deleteBook(String maSach) {
        String sql = "DELETE FROM SACH WHERE MaSach = ?";

        try (Connection connection = JDBCConnection.getJDBConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, maSach); 
            
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Sách với mã " + maSach + " đã được xóa thành công.");
            } else {
                System.out.println("Không tìm thấy sách với mã " + maSach + " để xóa.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
