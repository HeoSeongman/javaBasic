<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie.jsp</title>
<style type="text/css">
	div {
		display: inline-block;
	}
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").click(function() {
			$.ajax({
				url: "movie",
				data: {
					title: $("#title").val(),
					price: $("#price").val()
				},
				success: function(res) {
					console.log("요청 성공");
					$("#resultMovie").html(res);
				},
				error: function(res) {
					console.log("요청 실패");
				}
			});
		});
		
		$("#btn2").click(function() {
			$.ajax({
				url: "fruit",
				success: function(res) {
					$("#resultFruit").html(res);
				}
			});
		});
		
		$("#btn3").click(function() {
			$.ajax({
				url: "tour",
				success: function(res) {
					$("#resultTour").html(res);
				}
			});
		});
	});
</script>
</head>
<body>
	<p>영화 제목 : <input id="title" value="테넷"/></p>
	<p>영화 관람료 : 
		<input type="number" id="price" value="10000"/>
		<button id="btn1">영화 관람 확인</button>
	</p>
	<hr color="red">
	
	<div id="resultMovie"></div>
	<hr color="blue">
	
	<input id="btn2" type="button" value="과일 목록을 가지고 와보자." />
	<input id="btn3" type="button" value="여행 목록을 가지고 와보자." />
	<hr color="red">
	
	<div id="resultFruit"></div>
	<div id="resultTour"></div>
	<hr color="blue">
</body>
</html>