<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs_select.jsp</title>
<style type="text/css">
	body {
		background-color: orange;
		font-size: 30px;
		color: white;
	}
	
	button {
		font-size: 30px;	
	}
	
	input {
		font-size: 30px;		
	}
	
	#replyResult {
		margin-left: 50px;
	}
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").click(function() {
			content = $("#reply").val();
			writer = "ice";
			$.ajax({
				url: "reply_insert",
				data: {
					bbsno: ${vo.no},
					content: content,
					writer: writer 
				},
				success: function(res) {
					alert("댓글 달기 성공");
					$("#replyResult").append("<hr color=blue><p>" + content + ", " + writer + "</p>");
					$("#reply").val("");
				}
			})
		})
	})
</script>
</head>
<body>
	<p>bbs_select.jsp 페이지</p>
	<%-- <p>no : ${vo.no }</p>
	<p>title : ${vo.title }</p>
	<p>content : ${vo.content }</p>
	<p>writer : ${vo.writer }</p> --%>
	<p>${vo.no }, ${vo.title }, ${vo.content }, ${vo.writer }</p>
	<hr color="red">
	<p>댓글 작성 : <input id="reply"/><button id="btn1">댓글 달기</button></p>
	
	<div id="replyResult">
		<c:forEach items="${replyList }" var="reply">
			<hr color="blue">
			<%-- <p>no : ${reply.no }</p>
			<p>bbsno : ${reply.bbsno }</p>
			<p>content : ${reply.content}</p>
			<p>writer : ${reply.writer}</p> --%>
			<p>${reply.content}, ${reply.writer}</p>  
		</c:forEach>
	</div>
</body>
</html>