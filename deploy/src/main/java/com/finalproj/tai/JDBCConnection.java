package com.finalproj.tai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.Exception;

public class JDBCConnection {
	
	public static Connection getJDBConnection() {
	    final String url = "jdbc:mysql://localhost:3306/nguoiqlcsdl?ssl-mode=REQUIRED?useUnicode=true&characterEncoding=UTF-8";
	    final String taiKhoan = "root";
	    final String matKhau = "Quanopo123+";
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection ketNoi = DriverManager.getConnection(url, taiKhoan, matKhau);
	        return ketNoi;
	    } catch (ClassNotFoundException e){
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
