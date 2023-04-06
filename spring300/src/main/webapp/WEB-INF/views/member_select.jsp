<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/select.jsp</title>
<style type="text/css">
	body {
		background-color: yellow;
	}
</style>
</head>
<body>
	<p>select로 요청을 반환</p>
	<p>id : ${ vo.id }</p>
	<p>pw : ${ vo.pw }</p>
	<p>name : ${ vo.name }</p>
	<p>tel : ${ vo.tel }</p>
</body>
</html>