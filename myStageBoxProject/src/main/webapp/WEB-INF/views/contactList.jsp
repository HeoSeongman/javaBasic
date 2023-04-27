<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1 문의 내역</title>
<%@ include file="../../header.jsp"%>
<style type="text/css">
	.contactItem:first-child {
		border-top: 1px solid grey;
	}
	
	.contactItem {
		list-style: none;
		border-bottom: 1px solid grey;
		text-align: left;
	}
	
	.contactItemBtn {
		padding: 12px;
		font-size: 24px;
		border: 0;
		background-color: transparent;
		cursor: pointer;
	}
	
</style>
</head>
<body>
	<a href="HelpMain" id="HelpMain"><h1>고객센터</h1></a>
	<hr color="red">

	<div id="search">
		<form action="faqSearch">
			<h2 id="faqTitle">FAQ 검색</h2>
			<input type="text" id="searchInput" name="search"/>
			<button type="submit" id="searchBtn">검색</button>
		</form>
	</div>
	
	<div id="contactItemList">
		<ul id="contactList">
		<c:forEach items="${contactList }" var="item">
			<li class="contactItem">
				<button class="contactItemBtn">${item.title }</button>
			</li>
		</c:forEach>
		</ul>
	</div>
	
	<div id="other">
		<a href="contactWrite?member=${member }">
			<button class="btn-large">문의 작성</button>
		</a>
	</div>
</body>
</html>