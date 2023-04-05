<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Call Json</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">	
	$(function() {
		$("#btn1").click(function() {
			$.ajax({
				url: "json.jsp",
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res + "</p>");
				}
			});
		});
		
		$("#btn2").click(function() {
			$.ajax({
				url: "json2.jsp",
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res + "</p>");
				}
			});
		});
		
		$("#btn3").click(function() {
			$.ajax({
				url: "json3.jsp",
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res + "</p>");
				}
			});
		});
		
		$("#btn4").click(function() {
			$.ajax({
				url: "json4.jsp",
				dataType: "json",
				success: function(res) {
					console.log(res);
					let yesday = JSON.parse(res[0].yesterday);
					let today = JSON.parse(res[1].today);
					
					$("#result").append("<p>어제 " + yesday.high + " " + yesday.low + " " + yesday.end + "</p>");
					$("#result").append("<p>오늘 " + today.high + " " + today.low + " " + today.end + "</p>");
				}
			});
		});
	});
</script>
</head>
<body>
	<button id="btn1">JSON 받아오기</button>
	<button id="btn2">JSON2 받아오기</button>
	<button id="btn3">JSON3 받아오기</button>
	<button id="btn4">JSON4 받아오기</button>
	<hr color="red">
	
	<div id="result"></div>
</body>
</html>