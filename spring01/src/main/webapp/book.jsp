<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book.jsp</title>
<style type="text/css">
	body {
		background-color: orange;
		color: white;
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
	<p>북마크 등록 화면</p>
	<form action="book_insert">
		<p>북마크명 : <input name="name"/></p>
		<p>북마크 URL : <input name="url"/></p>
		<p>북마크 이미지 : <input name="img"/></p>
		<button>북마크 등록 버튼</button>
	</form>
	
	<p>북마크 검색 화면</p>
	<form action="book_select">
		<p>북마크 ID : <input name="id"/></p>
		<button>북마크 검색 버튼</button>
	</form>
</body>
</html>