<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/OK</title>
<style type="text/css">
	body {
		font-size: 30px;
		background-color: yellow;
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
	<p>${id } 님, 로그인 처리 성공!</p>
	<img src="resources/img/homer.webp"/><br>
	
	<a href="bbs.jsp" >
		<button style="background-color: pink;">게시판 화면으로</button>
	</a>
	<a href="news.jsp" >
		<button style="background-color: pink;">뉴스 화면으로</button>
	</a>
	<a href="cafe.jsp" >
		<button style="background-color: pink;">카페 화면으로</button>
	</a>
</body>
</html>