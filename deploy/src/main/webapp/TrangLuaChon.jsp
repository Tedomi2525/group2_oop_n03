<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Trang đăng nhập</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="keywords">

<link href="/deploy/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>

<link rel="stylesheet" href="/deploy/style.css" type="text/css" media="all">

<link href="//fonts.googleapis.com/css?family=Quicksand:300,400,500,700" rel="stylesheet">

</head>
<body>

	<h1>Hệ thống quản lý thư viện</h1>

	<div class="w3layoutscontaineragileits">
	<h2>Đăng nhập</h2>
		<form action="/deploy/DangNhapServlet" method="post">
			<input type="text" id="TenNguoiDung" name="TenNguoiDung" placeholder="Tên tài khoản" required>
			<input type="password" id="Matkhau" name="Matkhau" placeholder="Mật khẩu" required>
			<ul class="agileinfotickwthree">
				<li>
					<input type="checkbox" id="brand1" value="">
					<label for="brand1"><span></span>Ghi nhớ mật khẩu</label>
					<a href="#">Quên mật khẩu?</a>
				</li>
			</ul>
			<div class="aitssendbuttonw3ls">
				<input type="submit" value="Đăng nhập">
				<p> Để tạo tài khoản mới <span>→</span> <a class="w3_play_icon1" href="/deploy/NguoiQuanLy/DangKy.jsp"> Ấn vào đây</a></p>
				<div class="clear"></div>
			</div>
		</form>
	</div>
	<script>
		$(document).ready(function() {
		$('.w3_play_icon,.w3_play_icon1,.w3_play_icon2').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
		});
																		
		});
	</script>

</body>
</html>

