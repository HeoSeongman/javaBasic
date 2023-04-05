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
				url: "json1",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res.id + " " + res.pw + " " + res.name + " " + res.tel + "</p>");
				}
			});
		});
		
		$("#btn11").click(function() {
			$.ajax({
				url: "json1",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<table border=1><tr><td>항목명</td><td>값</td></tr>" + 
							"<tr><td>아이디</td><td>" + res.id + "</td></tr>" +
							"<tr><td>비밀번호</td><td>" + res.pw + "</td></tr>" +
							"<tr><td>이름</td><td>" + res.name + "</td></tr>" +
							"<tr><td>전화번호</td><td>" + res.tel + "</td></tr></table>");
				}
			});
		});
		
		$("#btn111").click(function() {
			$.ajax({
				url: "json1",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<ol><li>" + res.id + 
							"</li><li>" + res.pw + 
							"</li><li>" + res.name + 
							"</li><li>" + res.tel + "</li></ol>");
				}
			});
		});
		
		$("#btn2").click(function() {
			$.ajax({
				url: "json2",
				success: function(res) {
					console.log(res[0]);
					res.forEach((data) => {
						$("#result").append("<p>" + data.id + " " + data.pw + " " + data.name + " " + data.tel + "</p>");						
					})
				}
			});
		});
		
		$("#btn3").click(function() {
			$.ajax({
				url: "json3",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res.no + " " + res.title + " " + res.content + " " + res.writer + "</p>");
				}
			});
		});
		
		$("#btn4").click(function() {
			$.ajax({
				url: "json4",
				dataType: "json",
				success: function(res) {
					console.log(res);
					res.forEach((data) => {
						$("#result").append("<p>" + data.no + " " + data.title + " " + data.content + " " + data.writer + "</p>");
					})
				}
			});
		});
	});
</script>
</head>
<body>
	<button id="btn1">컨트롤러에서 JSON 받아오기</button>
	<button id="btn11">컨트롤러에서 JSON11 받아오기</button>
	<button id="btn111">컨트롤러에서 JSON111 받아오기</button>
	<button id="btn2">컨트롤러에서 JSON2 받아오기</button>
	<button id="btn3">컨트롤러에서 JSON3 받아오기</button>
	<button id="btn4">컨트롤러에서 JSON4 받아오기</button>
	<hr color="red">
	
	<div id="result"></div>
</body>
</html>