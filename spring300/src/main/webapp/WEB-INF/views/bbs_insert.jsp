<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo" class="com.multi.mvc300.BbsVO"></jsp:useBean>
    <jsp:setProperty property="*" name="vo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs_insert.jsp</title>
<style type="text/css">
	body {
		background-color: orange;
	}
</style>
</head>
<body>
	<p>bbs_insert.jsp 페이지</p>
	<p>no : <%=vo.getNo() %></p>
	<p>title : <%=vo.getTitle() %></p>
	<p>content : <%=vo.getContent() %></p>
	<p>writer : <%=vo.getWriter() %></p>
</body>
</html>