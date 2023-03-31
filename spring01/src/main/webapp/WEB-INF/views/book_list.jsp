<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book_list.jsp</title>
<style type="text/css">
	body {
		background-color: lime;
	}
	
	table {
		background-color: white;
		color: black;
		font-size: 30px;
	}
	
	.top {
		background-color: black;
		color: white;
	}
	
	img {
		width: 300px;
		transition: .2s;
	}
	
	img:hover {
		width: 340px;
	}
	
	img:active {
		width: 330px;
	}
</style>
</head>
<body>
	<p>전체 북마크 검색 결과</p>
	<table border="1">
		<tr class="top">
			<td>ID</td>
			<td>이름</td>
			<td>URL</td>
			<td colspan="2">이미지</td>
		</tr>
		<c:forEach items="${list }" var="item">
		<tr>
			<td>${item.id }</td>
			<td>${item.name }</td>
			<td>${item.url }</td>
			<td>${item.img }</td>
			<td>
				<a href="${item.url }">
					<img src="resources/img/${item.img }"/>
				</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>