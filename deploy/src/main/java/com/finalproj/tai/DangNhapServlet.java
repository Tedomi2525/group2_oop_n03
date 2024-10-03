package com.finalproj.tai;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.finalproj.tai.JDBCConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/deploy/ThuVien/thuVien.jsp")
public class DangNhapServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tenNguoiDung = request.getParameter("TenNguoiDung");
        String matkhau = request.getParameter("Matkhau");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCConnection.getJDBConnection();
            String sql = "SELECT * FROM NGUOIQUANLY WHERE TenNguoiDung = ? AND Matkhau = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tenNguoiDung);
            preparedStatement.setString(2, matkhau);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                HttpSession session = request.getSession();
                session.setAttribute("TenNguoiDungQuanLy", tenNguoiDung);
                response.sendRedirect("/deploy/ThuVien/thuVien.jsp");
            } else {
                response.sendRedirect("/deploy/NguoiQuanLy/DangNhap.jsp?error=invalid");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("/deploy/NguoiQuanLy/DangNhap.jsp?error=sql");
        } finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
        }
        try (FileWriter fw = new FileWriter("D:\\login.txt", true); PrintWriter pw = new PrintWriter(fw)) {
			pw.println("Tài khoản: " + tenNguoiDung);
			pw.println("Mật khẩu: " + matkhau);
			pw.println("------------------------------");
			System.out.println("Lưu thành công");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
