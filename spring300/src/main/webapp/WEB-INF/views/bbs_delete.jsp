<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs_delete.jsp</title>
<style type="text/css">
	body {
		background-color: orange;
	}
</style>
</head>
<body>
	<p>bbs_delete.jsp 페이지</p>
	<p>삭제된 게시글 번호 : <%= request.getParameter("no") %></p>
</body>
</html>