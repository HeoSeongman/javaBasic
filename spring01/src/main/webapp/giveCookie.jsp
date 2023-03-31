<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Give Cookie</title>
</head>
<body>
	<%
		//1. 쿠기 객체 생성, 브라우저에 저장할 정보 1개당 쿠키 1개
		Cookie c1 = new Cookie("name", "heo");
		Cookie c2 = new Cookie("age", "26");
		//2. 쿠키를 서버에서 브라우저로 보낸다.
		response.addCookie(c1);
		response.addCookie(c2);
	%>
	<hr>브라우저에 쿠키를 심었음.
	<a href="getCookieList.jsp">cookie 목록 가져오기</a>
</body>
</html>