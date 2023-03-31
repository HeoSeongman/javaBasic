<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs_list.jsp</title>
<style type="text/css">
	body {
		font-size: 30px;
		background-color: yellow;
	}
	
	td {
		background-color: lime;
		color: white;
	}
	
	.top > * {
		background: black;
	}
</style>
</head>
<body>
	<p>전체 게시글 검색 결과</p>
	<table border="1">
		<tr class="top">
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
		</tr>
		<c:forEach items="${list }" var="item">
			<tr>
				<td>${item.no }</td>
				<td>
					<a href="bbs_select?no=${item.no }">${item.title }</a>
				</td>
				<td>${item.content }</td>
				<td>${item.writer }</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>