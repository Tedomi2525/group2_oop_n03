<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<%
    String studentId = request.getParameter("MaSV");
    String studentName = request.getParameter("NameSV");
    String[] sachDaChon = request.getParameterValues("sachDaChon");

    // Kết nối tới cơ sở dữ liệu và kiểm tra sách đã mượn
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nguoiqlcsdl", "root", "Quanopo123+");
        
        // Kiểm tra sách đã mượn
        for (String thongTinSach : sachDaChon) {
            String[] moTaSach = thongTinSach.split(",");
            String maSach = moTaSach[0];

            ps = conn.prepareStatement("SELECT COUNT(*) FROM MuonTra WHERE MaSV = ? AND MaSach = ?");
            ps.setString(1, studentId);
            ps.setString(2, maSach);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                out.println("Bạn đã mượn sách này trước đó: " + maSach);
                continue; // Bỏ qua sách này nếu đã mượn
            }
            // Tiến hành thêm sách vào bảng mượn
            // ...
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (ps != null) try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
%>
