<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String uid = request.getParameter("id");
if(uid == null) {
	out.print("로그인 정보가 없습니다.");
}else {
	session.setAttribute("id",uid);
	response.sendRedirect("sessionMain.jsp");
}
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