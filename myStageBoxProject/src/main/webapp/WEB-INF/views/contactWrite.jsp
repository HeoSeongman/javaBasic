<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1 문의 작성</title>
<%@ include file="../../header.jsp" %>
<style type="text/css">	
	td {
		font-size: 26px;
		padding: 10px 30px;
	}
	
	td > * {
		font-size: 20px;
	}
	
	#contactWrite {
		display: inline-block;
	}
	
	.textInput {
		display: flex;
		width: 100%;
	}
	
	select {
		display: block;
	}
</style>
</head>
<body>
	<a href="HelpMain" id="HelpMain"><h1>고객센터</h1></a>
	<hr color="red">
	
	<div id="contactWrite">
		<form action="contactCreate?member=${member }">
			<table>
				<tr>
					<td>제목</td>
					<td>
						<input type="text" name="title" class="textInput"/>
					</td>
				</tr>
				<tr>
					<td>유형</td>
					<td>
						<select name="helpCategory">
						<c:forEach items="${helpCategory}" var="item">
							<option value="${item }">${item.name}</option>
						</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>내용</td>
					<td>
						<textarea name="content" rows="20" cols="60" style="resize: none; font-weight: bold;" class="textInput"></textarea>
					</td>
				</tr>
			</table>
			<input name="member" value="${member }" hidden="hidden"/>
			<button class="btn-large" type="submit">등록</button>
			<a href="HelpMain"><button class="btn-large">취소</button></a>
		</form>
	</div>

</body>
</html>