<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>music_list.jsp</title>
<style type="text/css">
	body {
		background-color: lime;
		font-size: 30px;
	}
	
	td {
		padding: 0 10px;
	}
	
	button {
		font-size: 30px;
	}
	
	a {
		text-decoration: none;
		color: black;
	}
	
	a:hover {
		color: white;
		text-decoration: underline;
	}
</style>
</head>
<body>
	<p>전체 음악 검색이 완료되었습니다.</p>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>제목</td>
		</tr>
		<c:forEach items="${list}" var="item">
		<tr>
			<td>${item.id }</td>
			<td>
				<a href="music_select?id=${item.id }">
					${item.name }
				</a>
			</td>
		</tr>		
		</c:forEach>
	</table>
	<hr color="red">
	
	<a href="music_insert.jsp"><button>등록</button></a>
	<hr color="red">
	
	<a href="music.jsp"><button>홈으로</button></a>
</body>
</html>