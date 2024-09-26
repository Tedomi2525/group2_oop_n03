<%@ page import="com.finalproj.service.BookService"%>
<%@ page import="com.finalproj.model.Books"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Sách Thành Công</title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f9f9f9;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}

.container {
	margin: 20px auto;
	padding: 40px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
	max-width: 600px;
	text-align: center;
}

h2 {
	font-size: 24px;
	color: #333;
	margin-bottom: 20px;
}

a.btn {
	display: inline-block;
	padding: 12px 25px;
	background-color: #007bff;
	color: #fff;
	text-decoration: none;
	font-size: 16px;
	border-radius: 5px;
	transition: background-color 0.3s ease;
}

a.btn:hover {
	background-color: #0056b3;
}

.error {
	color: #dc3545;
}

.success {
	color: #28a745;
}

.back-link {
	margin-top: 30px;
}

.back-link a {
	color: #007bff;
	text-decoration: none;
	font-weight: bold;
	padding: 10px 20px;
	border-radius: 5px;
	border: 1px solid #007bff;
	background-color: #f9f9f9;
	transition: background-color 0.3s ease, color 0.3s ease;
}

.back-link a:hover {
	background-color: #007bff;
	color: white;
}
</style>
</head>
<body>
	<div class="container">
		<%
		String maSach = request.getParameter("bookId");
		String tenSach = request.getParameter("bookName");
		String tacGia = request.getParameter("bookAuthor");
		String theLoai = request.getParameter("bookCategory");
		String soLuongTong = request.getParameter("totalQuantity");

		if (maSach != null && tenSach != null && tacGia != null && theLoai != null && soLuongTong != null) {
			try {
				int soLuongTongValue = Integer.parseInt(soLuongTong);

				if (soLuongTongValue < 0) {
					out.println("<h2 class='error'>Vui lòng kiểm tra lại số lượng!</h2>");
				} else {
					BookService bookService = new BookService();
					
					if (bookService.isBookExists(maSach)) {
						out.println("<h2 class='error'>Mã sách này đã tồn tại!</h2>");
					} else {
						Books newBook = new Books();
						newBook.setMaSach(maSach);
						newBook.setTenSach(tenSach);
						newBook.setTacGia(tacGia);
						newBook.setTheLoai(theLoai);
						newBook.setSoluongtong(soLuongTongValue);
						newBook.setSoluongmuon(0);
						newBook.setSoluongcon(soLuongTongValue);

						bookService.addBooks(newBook);

						out.println("<h2 class='success'>Thêm sách thành công!</h2>");
					}
				}
			} catch (NumberFormatException e) {
				out.println("<h2 class='error'>Đã xảy ra lỗi khi thêm sách. Vui lòng kiểm tra lại thông tin.</h2>");
				e.printStackTrace();
			}
		} else {
			out.println("<h2 class='error'>Thông tin không đầy đủ để thêm sách.</h2>");
		}
		%>
		<div class="back-link">
			<a href="books.jsp">Quay lại danh sách sách</a>
		</div>
	</div>
</body>
</html>
