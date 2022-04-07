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
//자바영역
String uid = request.getParameter("id");
String upw = request.getParameter("pw");
%>

<h3>User ID: <%=uid %></h3>
<h3>User PW: <%=upw %></h3>
<h5>by 04 김규빈</h5>
</body>
</html>