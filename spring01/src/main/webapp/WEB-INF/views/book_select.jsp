<%@page import="com.multi.mvc00.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book_select.jsp</title>
<style>
	body {
		background-color: silver;
		color: white;
		font-size: 30px;
	}
	
	p {
		border: 1px solid green;
	}
	
	img {
		width: 500px;
	}
</style>
</head>
<body>
	<p>북마크 검색에 성공하였습니다.</p>
	<p>id : ${vo.id}</p>
	<p>name : ${vo.name }</p>
	<p>url : <a href=${vo.url }>${vo.url }</a></p>
	<p>img : </p>
	<a href=${vo.url }>
		<img src="resources/img/${vo.img}"/>	
	</a>
</body>
</html>