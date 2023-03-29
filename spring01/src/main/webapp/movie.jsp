<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie.jsp</title>
</head>
<body>
	<p>영화 장르 선택 화면</p>
	<form action="movie" method="get">
		<p>영화 장르 : <input name="movie"/></p>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	
	<form action="movie" method="get">
		<p>영화 장르 : 
			<select name="movie">
				<option value="코미디">코미디
				<option value="드라마">드라마
				<option value="액션">액션
			</select>
		</p>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>