<%@page import="com.multi7.myStageBox.FaqVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터 - 마이스테이지박스</title>
<style type="text/css">
	body {
		margin: 0 200px;
		background-color: ivory;
	}
	
	h1 {
		text-align: center;
	}
	
	#left {
		float: left;
		border: 1px solid grey;
		border-radius: 6px;
		padding: 0 10px;
	}
	
	#contactBtn {
		width: 200px;
		height: 40px;
		font-size: 20px;
		line-height: 0;
	}
	/* -- */
	#right {
		margin-left: 300px;
	}
	
	#faqTitle {
		display: inline-block;
		margin: 0;
	}
	
	#categorySelect {
		font-size: 16px;
	}
	
	#faqTable {
		margin-top: 10px;
	}
	
	#faqTable tr th {
		border-top: 1px solid grey;
	}
	
	#faqTable tr > *{
		border-bottom: 1px solid grey;
		padding: 10px 0;
	}
	
	.type {
		width: 200px;
	}
	
</style>
</head>
<body>
	<h1>고객센터</h1>
	<hr color="red">
	<p><a href="javascript:void(0)">홈</a></p>
	<div id="left">
		<ul>
			<c:forEach items="${helpCategoryDetail}" var="item">
			<li>${item.name }</li>
			</c:forEach>
		</ul>
		<p><a href="ContactWrite"><button id="contactBtn">1:1문의</button></a></p>
	</div>
	
	<div id="right">
		<form action="faq">
			<h2 id="faqTitle">FAQ 검색</h2>
			<select name="category" id="categorySelect">
				<option value="0">전체</option>
				<c:forEach items="${helpCategoryDetail}" var="item">
				<option value="${item.num }">${item.name }</option>
				</c:forEach>
			</select>
			<input type="text" />
			<button type="submit">검색</button>
		</form>
		<table id="faqTable" cellspacing="0">
		<tr>
			<th class="type"><p>유형</p></th>
			<th><p>제목</p></th>
		</tr>
		<%
			List<FaqVO> list = (List<FaqVO>) request.getAttribute("faqList");
			for (FaqVO vo : list) {%>
			<tr>
				<td class="type"><%= vo.getCategoryName() %></td>
				<td><%= vo.getTitle() %></td>
			</tr>
		<%} %>
		</table>
	</div>
</body>
</html>