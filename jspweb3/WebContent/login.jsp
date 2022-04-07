<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Date now = new Date();
SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
String date = df.format(now);

if(date.endsWith("30")){
	response.sendRedirect("underCheck.jsp");
	return;
}

	String uid = request.getParameter("id");
	out.print(uid);
%>
    
    
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html> -->