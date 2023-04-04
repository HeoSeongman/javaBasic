<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax_test01</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url: "bbs_list",
			success: function(res) {
				$("#result").append(res);
			}
		});
		
		$("#btn1").click(function() {
			$("#result").empty();
			$.ajax({
				url: "bbs_update",
				data: {
					no: $("#modify_no").val(),
					content: $("#modify_content").val()
				},
				success: function (res) {
					$("#result").append(res + "<br>수정완료!!!");
				}
			});
		});
		
		$("#btn2").click(function() {
			$.ajax({
				url: "bbs_delete",
				data: {
					no: $("#delete_no").val()
				},
				success: function(res) {
					console.log(res);
					if (res == 1) {
						location.href = "ajax_test01.jsp";						
					}
				}
			});
		});
		
		$("#btn3").click(function() {
			$("#result").empty();
			$.ajax({
				url: "bbs_list",
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
		
		$("#btn4").click(function() {
			$("#result").empty();
			$.ajax({
				url: "https://api.openweathermap.org/data/2.5/weather?q=seoul&units=metric&lang=kr&appid=62c1fba6b9bbd29770077596ee7b18ac",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<p>오늘 서울 날씨 : " + res.weather[0].description + "</p>");
				}
			});
		});
	});
</script>
</head>
<body>
	<p>
		수정할 no : <input id="modify_no"/>
		content : <input id="modify_content"/>
		<button id="btn1">bbs 수정</button>
	</p>
	<p>
		삭제할 no : <input id="delete_no"/>
		<button id="btn2">bbs 삭제</button>
	</p>
	<hr color="red">
	
	<button id="btn3">bbs 목록 가져오기</button>
	<button id="btn4">날씨 가져오기</button>
	<hr color="orange">
	
	<div id="result"></div>
</body>
</html>