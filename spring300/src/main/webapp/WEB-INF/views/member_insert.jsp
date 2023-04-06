<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo" class="com.multi.mvc300.MemberVO"></jsp:useBean>
    <jsp:setProperty property="*" name="vo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/insert</title>
<style type="text/css">
	body {
		background-color: yellow;
	}
</style>
</head>
<body>
	<p>insert로 요청을 반환</p>
	<p>id : <%=vo.getId() %></p>
	<p>pw : <%=vo.getPw() %></p>
	<p>name : <%=vo.getName() %></p>
	<p>tel : <%=vo.getTel() %></p>
</body>
</html>