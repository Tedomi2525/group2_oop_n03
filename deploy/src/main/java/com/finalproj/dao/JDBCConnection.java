package com.finalproj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static Connection getJDBConnection() {
	    final String url = "jdbc:mysql://localhost:3306/admindb";
	    final String user = "root";
	    final String password = "Quanopo123+";
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection(url, user, password);
	        return connection;
	    } catch (ClassNotFoundException e){
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
