<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_list.jsp</title>
<style type="text/css">
	body {
		background-color: yellow;
	}
</style>
</head>
<body>
	<p>회원 검색 요청 완료됨.</p>
	<c:forEach items="${list }" var="item">
		<hr color="red">
		<p>아이디 : ${item.id }</p>
		<p>비밀번호 : ${item.pw }</p>
		<p>이름 : ${item.name }</p>
		<p>전화번호 : ${item.tel }</p>
	</c:forEach>
</body>
</html>