<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록 출력</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB 연결
String url ="jdbc:mysql://localhost:3306/univ2";
String id = "root";
String pw = "5415";

Connection conn = null; // DB연결 객체
PreparedStatement pstmt = null; // DB에 전달할 SQL 구문객체
ResultSet rset = null; // DB에서 꺼내올 데이터들을 담을 객체

conn = DriverManager.getConnection(url,id,pw);

// 테이블 만들기 SQL

String sql = "SELECT * FROM student";

pstmt = conn.prepareStatement(sql);


rset = pstmt.executeQuery();
%>

<form>
<table>
<caption>학생 목록</caption>
<tr>
<th>학번</th>
<th>이름</th>
<th>전공</th>
</tr>
<%
	while(rset.next()) {
		
		String hakbun = rset.getString("hakbun");
		String name = rset.getString("name");
		String dept = rset.getString("dept");
%>

<tr>
<td><%=hakbun %></td>
<td><%=name %></td>
<td><%=dept %></td>
</tr>
<%} %>
</table>
</form>




<% 
// DB 연결 종료
if (pstmt != null) pstmt.close();
if (conn != null) conn.close();

%>
</body>
</html>