<%@page import="com.multi.mvc300.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs_select.jsp</title>
<style type="text/css">
	body {
		background-color: orange;
		font-size: 30px;
		color: white;
	}
</style>
</head>
<body>
	<p>bbs_insert.jsp 페이지</p>
	<p>no : ${vo.no }</p>
	<p>title : ${vo.title }</p>
	<p>content : ${vo.content }</p>
	<p>writer : ${vo.writer }</p>
	<hr color="red">
	
	<a href="bbs_update">
		<button>수정</button>
	</a>
	<a href="bbs_delete?no=${vo.no }">
		<button>삭제</button>
	</a>
	<hr color="orange">
	
</body>
</html>