<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<script>
	$(function () {
		$.ajax({
			url: "list.memo",
			success: function (res) {
				$("#result").html(res);
			}
		});
		
		$("#push").click(function() {
			$.ajax({
				url: "insert.memo",
				data: {
					name: $("#name").val(),
					content: $("#content").val(),
					weather: $("#weather").val()
				},
				success: function (res) {
					// insert 성공 시, list 갱신
					$.ajax({
						url: "list.memo",
						success: function (res) {
							$("#result").html(res);
						}
					});
					$("#name").val("");
					$("#content").val("");
					$("#weather").val("");
				}
			});
		});
	});

</script>
</head>
<body>
<a href="test.memo?name=aaa&content=bbb">테스트(VO)</a>
	<h2 style="background: orange; color: red; width: 800px; height: 50px;">멀티 메모장!! 자유롭게 아무말이나~~!!</h2>

	이름 : <input id="name" value="win"> 
	메모 : <input id="content" size="30" value="win">
	날씨 : <input id="weather" value="win"> 
	<button id="push">등록</button>
	<div id="result" style="background: yellow; width:800px; height: 300px;"></div>
</body>
</html>
