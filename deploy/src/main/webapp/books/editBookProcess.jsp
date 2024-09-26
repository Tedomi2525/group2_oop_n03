<%@ page import="com.finalproj.model.Books"%>
<%@ page import="com.finalproj.service.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Xử lý cập nhật sách</title>
</head>
<body>
    <%
    String maSach = request.getParameter("maSach");
    String tenSach = request.getParameter("tenSach");
    String tacGia = request.getParameter("tacGia");
    String theLoai = request.getParameter("theLoai");
    int soLuongTong = Integer.parseInt(request.getParameter("soLuongTong"));
    int soLuongMuon = Integer.parseInt(request.getParameter("soLuongMuon"));

    Books book = new Books();
    book.setMaSach(maSach);
    book.setTenSach(tenSach);
    book.setTacGia(tacGia);
    book.setTheLoai(theLoai);
    book.setSoluongtong(soLuongTong);
    book.setSoluongmuon(soLuongMuon); 

    BookService bookService = new BookService();
    bookService.updateBooks(book);

    response.sendRedirect("books.jsp");
    %>
</body>
</html>
