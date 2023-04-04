<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax_test.jsp</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").click(function() {
			$("#result").empty(); // result 하위 요소 비우기
			$.ajax({
				url: "bbs_list",
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
		
		$("#btn2").click(function() {
			$("#result").empty(); // result 하위 요소 비우기
			$.ajax({
				url: "reply_list",
				data: {
					bbsno: 4
				},
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
		
		$("#btn3").click(function() {
			$("#result").empty(); // result 하위 요소 비우기
			$.ajax({
				url: "reply_list",
				data: {
					bbsno: 10
				},
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
		
		$("#btn4").click(function() {
			$("#result").empty(); // result 하위 요소 비우기
			$.ajax({
				url: "member_select",
				data: {
					id: "apple"
				},
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
		
		$("#btn5").click(function() {
			$("#result").empty(); // result 하위 요소 비우기
			$.ajax({
				url: "bbs_one",
				data: {
					no: 7
				},
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
		
		$("#btn6").click(function() {
			$("#result").empty(); // result 하위 요소 비우기
			$.ajax({
				url: "member_list",
				success: function(res) {
					$("#result").append(res);
				}
			});
		});
	});
</script>
</head>
<body>
	<button id="btn1">bbs 댓글 목록 가져오기</button>
	<button id="btn2">bbs 4번 댓글 목록 가져오기</button>
	<button id="btn3">bbs 10번 댓글 목록 가져오기</button>
	<button id="btn4">member id가 apple인 사람의 정보 가져오기</button>
	<button id="btn5">bbs no가 1인 게시물의 상세 정보 가져오기</button>
	<button id="btn6">모든 member 목록 가져오기</button>
	<hr color="red">
	
	<div id="result"></div>
</body>
</html>