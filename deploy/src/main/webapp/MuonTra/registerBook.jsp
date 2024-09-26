<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles.css">
<title>Đăng ký mượn sách</title>
<style>
/* Đặt font chung */
body {
	font-family: 'Roboto', sans-serif;
	background-color: #f5f5f5;
	margin: 0;
	padding: 0;
}

.header {
	background-color: #333;
	color: white;
	position: relative;
	/* Đặt để các phần tử bên trong có thể định vị tương đối */
	padding: 20px;
	text-align: center;
}

.header h1 {
	margin: 0;
	font-size: 44px;
}

#borrowId {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
	margin-bottom: 10px;
}

.form-group label[for="borrowId"] {
	font-weight: bold;
	display: block;
	margin-bottom: 5px;
}

.out {
	position: absolute;
	bottom: 0;
	right: 20px;
	background-color: #ff1a1a;
	color: white;
	padding: 10px 20px;
	border-radius: 5px;
	text-decoration: none;
}

.out:hover {
	background-color: #c0392b;
}

.container {
	max-width: 1000px;
	margin: 50px auto;
	padding: 20px;
	background-color: white;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
}

h2 {
	font-size: 24px;
	margin-bottom: 20px;
	color: #2c3e50;
	font-weight: 700;
}

.form-container {
	display: flex;
	flex-direction: column;
	gap: 20px;
}

.form-group {
	display: flex;
	flex-direction: column;
	gap: 5px;
}

.form-group label {
	font-size: 18px;
	color: #34495e;
	padding: 10px;
}

.form-group input {
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
}

.form-group input:focus {
	outline: none;
	border-color: #3498db;
	box-shadow: 0 0 8px rgba(0, 0, 0, 0.3);
}

table {
	width: 100%;
	margin-top: 20px;
	border-collapse: collapse;
}

table th, table td {
	padding: 15px;
	border: 1px solid #ddd;
	text-align: center;
	font-size: 16px;
}

table th {
	background-color: #333;
	color: white;
}

table tr:hover {
	background-color: #f2f2f2;
}

.actions {
	text-align: center;
	margin-top: 30px;
}

.btn-submit {
	padding: 15px 30px;
	background-color: #3498db;
	color: white;
	border: none;
	border-radius: 5px;
	font-size: 18px;
	cursor: pointer;
	transition: background-color 0.3s;
}

.btn-submit:hover {
	background-color: #2980b9;
}

/* Responsive */
@media ( max-width : 768px) {
	.search-bar {
		flex-direction: column;
	}
	.btn-search {
		width: 100%;
	}
	table th, table td {
		font-size: 14px;
	}
}

footer {
	position: fixed;
	bottom: 0;
	width: 100%;
	text-align: center;
	padding: 10px;
	box-shadow: 0 -2px 5px rgba(0, 0, 0, 0.1);
}

footer .out {
	background-color: #333;
	color: white;
	padding: 10px 20px;
	text-decoration: none;
	border-radius: 5px;
}

footer .btn:hover {
	background-color: #555;
}
</style>
</head>
<body>
	<header>
		<div class="header">
			<h1>Đăng ký mượn sách</h1>
			<a href="/deploy/index.jsp" class="out">Đăng xuất</a>
		</div>
	</header>

	<div class="container">
		<div class="form-container">
			<h2>Thông tin sinh viên</h2>
			<form action="processBorrow.jsp" method="post">
				<div class="form-group">
					<label for="borrowId">Mã Mượn:</label> <input type="text"
						id="borrowId" name="MaMuon" placeholder="Nhập mã mượn" required>
				</div>

				<div class="form-group">
					<label for="studentId">Mã Sinh Viên:</label> <input type="text"
						id="studentId" name="MaSV" placeholder="Nhập mã sinh viên"
						required>
				</div>

				<div class="form-group">
					<label for="studentName">Tên Sinh Viên:</label> <input type="text"
						id="studentName" name="NameSV" placeholder="Nhập tên sinh viên"
						required>
				</div>

				<div class="form-group">
					<label for="borrowDate">Ngày Mượn:</label> <input type="date"
						id="borrowDate" name="NgayMuon" required>
				</div>

				<div class="form-group">
					<label for="returnDate">Ngày Trả:</label> <input type="date"
						id="returnDate" name="NgayTra" required>
				</div>
				<h2>Sách đã chọn</h2>
				<table>
					<thead>
						<tr>
							<th>Mã sách</th>
							<th>Tên sách</th>
							<th>Tác giả</th>
							<th>Thể loại</th>
							<th>Số lượng còn</th>
						</tr>
					</thead>
					<tbody>
						<%
						String[] selectedBooks = request.getParameterValues("selectedBooks");
						if (selectedBooks != null) {
							for (String bookInfo : selectedBooks) {
								String[] bookDetails = bookInfo.split(","); // Tách thông tin sách
								String maSach = bookDetails[0];
								String tenSach = bookDetails[1];
								String tacGia = bookDetails[2];
								String theLoai = bookDetails[3];
								int soLuongCon = Integer.parseInt(bookDetails[4]);
						%>
						<tr>
							<td><%=maSach%></td>
							<td><%=tenSach%></td>
							<td><%=tacGia%></td>
							<td><%=theLoai%></td>
							<td><%=soLuongCon%></td>
						</tr>
						<%
						}
						} else {
						out.println("<tr><td colspan='5'>Chưa có sách nào được chọn.</td></tr>");
						}
						%>
					</tbody>
				</table>

				<div class="actions">
					<input type="submit" value="Đăng ký mượn sách" class="btn-submit">
				</div>
			</form>
		</div>
	</div>
	<footer>
		<a href="/deploy/books/libraryHome.jsp" class="out">Home</a>
	</footer>
</body>
</html>
