<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>
	<tr>
		<td>${vo.no }</td>
		<td>${vo.title }</td>
		<td>${vo.content }</td>
		<td>${vo.writer }</td>
	</tr>
</table>