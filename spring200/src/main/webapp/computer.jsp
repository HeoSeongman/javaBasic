<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>computer.jsp</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function () {
		$("#btn1").click(function () {
			$.ajax({
				url: "computer",
				data: {
					com: $("#com").val(),
					price1: $("#price1").val(),
					mouse: $("#mouse").val(),
					price2: $("#price2").val()
				},
				success: function(res) {
					alert("computer 요청 성공.");
					$("#result").html(res);
				},
				error: function(res) {
					alert("computer 요청 실패.");
				}
			});
		});
	});
</script>
</head>
<body>
	<p>컴퓨터 종류: <input id="com"/></p>
	<p>컴퓨터 가격 : <input id="price1"/></p>
	<p>마우스 종류 : <input id="mouse"/></p>
	<p>마우스 가격 : <input id="price2"/></p>
	<input type="button" id="btn1" value="컴퓨터 구매 항목 확인">
	<hr color="red">
	
	<div id="result"></div>
</body>
</html>