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
<%@ include file="../../header.jsp" %>
<style type="text/css">
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
	
	<div id="faqBtnList">
		<c:forEach items="${helpCategory}" var="item">
		<a href="faq?helpCategory=${item }"><button class="btn-large">${item.name }</button></a>
		</c:forEach>
	</div>
	<hr color="red">
	
	<div id="other">
		<a href="contactList">
			<button class="btn-large">1:1문의</button>
		</a>
	</div>
</body>
</html>