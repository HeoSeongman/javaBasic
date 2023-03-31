<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>music_insert.jsp</title>
<style type="text/css">
	body {
		background-color: lime;
		font-size: 30px;
	}
	
	button {
		font-size: 30px;
	}
	
	input {
		font-size: 30px;
	}
</style>
</head>
<body>
	<p>음악 등록</p>
	<form action="music_insert_request">
		<p>제목 : <input name="name"/></p>
		<p>가수 : <input name="singer"/></p>
		<p>장르 : <input name="genre"/></p>
		<p>앨범 : <input name="album"/></p>
		<button>음악 등록</button>
	</form>
	<hr color="red">
	
	<a href="music.jsp"><button>홈으로</button></a>
	<a href="music_list"><button>목록으로</button></a>
</body>
</html>