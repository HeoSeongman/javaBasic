<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">	
	td {
		background-color: lime;
		color: black;
	}
	
	.top > * {
		background: black;
		color: white;
	}
</style>
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
