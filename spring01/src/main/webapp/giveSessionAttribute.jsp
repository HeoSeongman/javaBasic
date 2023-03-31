<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>giveSessionAttribute</title>
</head>
<body>
	<%
		session.setAttribute("count", 0);
		session.setAttribute("user", "root");
	%>
	세션에 등록함.
	<a href="getSessionAttribute.jsp">getSessionAttribute</a>
</body>
</html>