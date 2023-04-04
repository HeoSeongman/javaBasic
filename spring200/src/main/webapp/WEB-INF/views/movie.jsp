<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1">
	<tr>
		<td>영화 제목</td>
		<td>영화 가격</td>
	</tr>
	<tr>
		<td>${vo.title}</td>
		<td>${vo.price}</td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="javascript:void(0)"><button>문자인증받기</button></a>
		</td>
	</tr>
</table>