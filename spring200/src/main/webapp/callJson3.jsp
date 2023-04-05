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
				url: "bbs_one22",
				dataType: "json",
				data: {
					no: parseInt(prompt("게시글 번호를 입력하세요."))
				},
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res.no + " " + res.title + " " + res.content + " " + res.writer + "</p>");
				}
			});
		});
		
		$("#btn11").click(function() {
			$.ajax({
				url: "bbs_one22",
				dataType: "json",
				data: {
					no: parseInt(prompt("게시글 번호를 입력하세요."))
				},
				success: function(res) {
					console.log(res);
					$("#result").append("<table border=1><tr><td>항목명</td><td>값</td></tr>" + 
							"<tr><td>번호</td><td>" + res.no + "</td></tr>" +
							"<tr><td>제목</td><td>" + res.title + "</td></tr>" +
							"<tr><td>내용</td><td>" + res.content + "</td></tr>" +
							"<tr><td>작성자</td><td>" + res.writer + "</td></tr></table>");
				}
			});
		});
		
		$("#btn111").click(function() {
			$.ajax({
				url: "bbs_list22",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<ul>");
					let ul = $("#result").children("ul");
					res.forEach((data) => {						
						ul.append("<li>" + data.no + ", " + data.title + ", " + data.content + ", " + data.writer + "</li>");
					});
					$("#result").append("</ul>");
				}
			});
		});
		
	});
</script>
</head>
<body>
	<button id="btn1">컨트롤러에서 bbs JSON(text) 받아오기</button>
	<button id="btn11">컨트롤러에서 bbs JSON(table) 받아오기</button>
	<button id="btn111">컨트롤러에서 bbs JSONArray 받아오기</button>
	<hr color="red">
	
	<div id="result"></div>
</body>
</html>