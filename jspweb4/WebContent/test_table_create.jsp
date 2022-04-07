<%@page import="java.sql.*"%>
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
// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB 연결
String url ="jdbc:mysql://localhost:3306/univ2";
String id = "root";
String pw = "5415";

Connection conn = null; // DB연결 객체
PreparedStatement pstmt = null; // DB에 전달할 SQL 구문객체

conn = DriverManager.getConnection(url,id,pw);

// 테이블 만들기 SQL


String sql = "CREATE TABLE professor("
			+"number int not null,"
			+"name varchar(10),"
			+"dept varchar(20),"
			+"primary key(number))";

pstmt = conn.prepareStatement(sql);
pstmt.executeUpdate();

// DB 연결 종료
if (pstmt != null) pstmt.close();
if (conn != null) conn.close();

out.print("DB 연결 문제 없음 by 04김규빈");
%>
</body>
</html>