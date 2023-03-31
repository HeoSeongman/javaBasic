<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cafe.jsp</title>
<style type="text/css">
	body {
		font-size: 30px;
	}
	
	input {
		font-size: 30px;
	}
	
	button {
		font-size: 30px;
	}
</style>
</head>
<body>
	<% if (session.getAttribute("id") == null) { %>
	<a href="login.jsp">
		<button>로그인 페이지로</button>
	</a>
	<% } else { %>
	<img src="resources/img/naver.png"/>
	<a href="bbb">
		<button>공동구매 참여</button>
	</a>
	<% } %>
	<hr color="red">	
</body>
</html>