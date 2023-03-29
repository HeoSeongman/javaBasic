<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs.jsp</title>
<style type="text/css">
	body {
		font-size: 30px;
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
	<p>게시글 등록</p>
	<form action="bbs_insert" method="get">
		<p>title : <input name="title"/></p>
		<p>content : <input name="content"/></p>
		<p>writer : <input name="writer"/></p>
		<button type="submit">게시글 등록</button>
	</form>
	<hr color="orange">
	
	<p>게시글 수정</p>
	<form action="bbs_update" method="get">
		<p>id : <input name="no"/></p>
		<p>title : <input name="title"/></p>
		<p>content : <input name="content"/></p>
		<p>writer : <input name="writer"/></p>
		<button>게시글 수정</button>
	</form>
	<hr color="orange">
	
	<p>게시글 삭제</p>
	<form action="bbs_delete" method="get">
		<p>id : <input name="no"/></p>
		<button>게시글 삭제</button>
	</form>
	<hr color="orange">
	
	<p>게시글 검색</p>
	<form action="bbs_select" method="get">
		<p>id : <input name="no"/></p>
		<button>게시글 검색</button>
	</form>
	<hr color="orange">
	
</body>
</html>