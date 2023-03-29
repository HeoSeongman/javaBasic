<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>food.jsp</title>
</head>
<body>
	<p>음식 선택 화면</p>
	<form action="food">
		<p>좋아하는 음식 : <input name="like" value="라면"/></p>
		<p>싫어하는 음식 : <input name="dislike" value="커피"/></p>
		<button>음식 결과 요청</button>
	</form>
</body>
</html>