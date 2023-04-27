<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.multi7.myStageBox.FaqVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FAQ - 자주 묻는 질문</title>
<%@ include file="../../header.jsp" %>
<style type="text/css">
	#searchList {
		padding: 0 40px;
	}
	
	.searchItem:first-child {
		border-top: 1px solid grey;
	}
	
	.searchItem {
		list-style: none;
		border-bottom: 1px solid grey;
		text-align: left;
	}
	
	.searchItemBtn {
		padding: 12px;
		font-size: 20px;
		border: 0;
		background-color: transparent;
		cursor: pointer;
		text-align: left;
	}
	
	.searchItemBtn h4 {
		margin-top: 0;
	}
	
	.searchItemBtn p {
		margin-bottom: 0;
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
	
	<div id="faqBtnList">
		<c:forEach items="${helpCategory}" var="item">
		<a href="faq?helpCategory=${item }"><button>${item.name }</button></a>
		</c:forEach>
	</div>
	
	<div id="searchItemList">
		<ul id="searchList">
		<c:forEach items="${searchList }" var="item">
			<li class="searchItem">
				<button class="searchItemBtn">
					<h4>${item.title }</h4>
					<p>${item.content }</p>
				</button>
			</li>
		</c:forEach>
		</ul>
	</div>
	
</body>
<script type="text/javascript">
	let list = document.getElementsByClassName("faqItemBtn");
	[...list].forEach(() => {
	    this.addEventListener("click", () => {
	        console.log("asdfasfd");
	    })
	})
</script>
</html>

