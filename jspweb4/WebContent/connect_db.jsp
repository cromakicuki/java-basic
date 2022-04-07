<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
try {
	Class.forName("com.mysql.jdbc.Driver");
	out.print("JDBC Driver loading 성송!!<br>");
}catch (ClassNotFoundException err) {
	out.print("JDBC Driver loading 실패!!<br>");
}

	String url = "jdbc:mysql://localhost:3306/";
	String id = "root";
	String pw = "5415";
	
	Connection conn = null;
	
	try{
		conn=DriverManager.getConnection(url,id,pw);
		out.print("SQL DB 연결 성공<br>");
	}catch (SQLException sqlerr) {
		out.print("SQL DB 연결 실패 <br>");
	}finally {
		if(conn != null) {
			try {
				conn.close();
				out.print("SQL DB 연결 종료");
			}catch (Exception conerr) {
				conerr.printStackTrace();
			}
		}
	}
%>
</body>
</html>