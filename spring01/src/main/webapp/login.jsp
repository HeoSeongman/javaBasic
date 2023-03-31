<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<p>로그인 화면입니다.</p>
	<hr color="red">
	<form action="member_login" method="get">
		<p>아이디 : <input name="id" value="id_test111"></p>
		<p>비밀번호 : <input name="pw" value="id_test111"></p>
		<button type="submit">로그인 요청</button>
	</form>
	<% } else { %>
		${id } 님이 로그인 중입니다.
		<a href="bbs.jsp" >
			<button style="background-color: pink;">게시판 화면으로</button>
		</a>
		<a href="news.jsp" >
			<button style="background-color: pink;">뉴스 화면으로</button>
		</a>
		<a href="cafe.jsp" >
			<button style="background-color: pink;">카페 화면으로</button>
		</a>
	<% } %>
</body>
</html>