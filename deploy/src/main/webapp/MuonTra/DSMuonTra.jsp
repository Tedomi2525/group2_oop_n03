<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách mượn trả</title>
</head>
<body>
	<header>
		<div class="header">
			<h1>Hệ thống quản lý mượn trả sách</h1>
			<a href="/deploy/TrangLuaChon.jsp" class="out" aria-label="Đăng xuất">Đăng xuất</a>
			<!-- Nút đăng xuất -->
		</div>
	</header>

	<div class="container">
		<h2>Danh sách mượn trả sách</h2>

		<table>
			<thead>
				<tr>
					<th>Mã mượn</th>
					<th>Mã sinh viên</th>
					<th>Tên người mượn</th>
					<th>Tên sách</th>
					<th>Ngày mượn</th>
					<th>Ngày trả</th>
					<th>Hành động</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="#" class="btn" aria-label="Xóa">Xóa</a></td>
				</tr>
				<!-- Các dòng dữ liệu người mượn khác -->
			</tbody>
		</table>
	</div>

	<footer>
		<a href="/deploy/ThuVien/thuVien.jsp" class="out" aria-label="Trang chủ">Home</a>
		<!-- Nút về trang chủ -->
	</footer>
</body>
</html>