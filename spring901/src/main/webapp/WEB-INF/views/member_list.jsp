<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_select</title>
</head>
<body>
	<p>전체 회원검색 요청됨.</p>
	<c:forEach items="${list}" var="vo">
		<p>id : ${vo.id }</p>
		<p>pw : ${vo.pw }</p>
		<p>name : ${vo.name }</p>
		<p>tel : ${vo.tel }</p>
		<hr color="red">	
	</c:forEach>
</body>
</html>