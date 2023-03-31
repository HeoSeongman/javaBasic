<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>music_update.jsp</title>
<style type="text/css">
	body {
		background-color: lime;
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
	<p>음악 수정</p>
	<form action="music_update_request">
		<input name="id" value="${vo.id }" hidden="hidden"/>
		<p>제목 : <input name="name" value="${vo.name }"/></p>
		<p>가수 : <input name="singer" value="${vo.singer }"/></p>
		<p>장르 : <input name="genre" value="${vo.genre }"/></p>
		<p>앨범 : <input name="album" value="${vo.album }"/></p>
		<button>음악 수정</button>
	</form>
	<hr color="red">
	
	<a href="music.jsp"><button>홈으로</button></a>
	<a href="music_list"><button>목록으로</button></a>
</body>
</html>