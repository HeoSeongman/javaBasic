<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Call Json</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c99f52b98909ec4649a6d4842259c340"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">	
	$(function() {
		$("#btn1").click(function() {
			$("#result").empty();
			$.ajax({
				url: "member_select_json",
				dataType: "json",
				data: {
					id: prompt("회원 아이디를 입력하세요.")
				},
				success: function(res) {
					console.log(res);
					$("#result").append("<p>" + res.id + " " + res.pw + " " + res.name + " " + res.tel + "</p>");
				}
			});
		});
		
		$("#btn2").click(function() {
			$("#result").empty();
			$.ajax({
				url: "member_list_json",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<ul>");
					let ul = $("#result").children("ul");
					res.forEach((data) => {						
						ul.append("<li>" + data.id + ", " + data.pw + ", " + data.name + ", " + data.tel + "</li>");
					});
					$("#result").append("</ul>");
				}
			});
		});
		
		$("#btn3").click(function() {
			$("#result").empty();
			$.ajax({
				url: "member_list_json",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<table border=1><tr><td>아이디</td><td>비밀번호</td><td>이름</td><td>전화번호</td></tr>");
					let table = $("#result").children("table")
					res.forEach((data) => {
						table.append("<tr><td>" + data.id +
								"</td><td>" + data.pw + 
								"</td><td>" + data.name + 
								"</td><td>" + data.tel + "</td></tr>");
					})
					$("#result").append("</table>");
					
				}
			});
		});
		
		$("#btn4").click(function() {
			$("#result").empty();
			$.ajax({
				crossOrigin: true,
				url: "map",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<div id=map style=width:100%;height:350px;></div>");
					
					let mapContainer = document.getElementById('map'), // 지도를 표시할 div 
				    mapOption = { 
				        center: new kakao.maps.LatLng(res[0].lat, res[1].lng), // 지도의 중심좌표
				        level: 3 // 지도의 확대 레벨
				    };
					let map = new kakao.maps.Map(mapContainer, mapOption);  // 지도를 생성
				}
			});
		});
		
		$("#btn5").click(function() {
			$("#result").empty();
			$.ajax({
				url: "chart",
				dataType: "json",
				success: function(res) {
					console.log(res);
					$("#result").append("<div id=chart_div style=width: 900px; height: 500px;></div>");
					
					google.charts.load('current', {'packages':['corechart']});
				      google.charts.setOnLoadCallback(drawVisualization);

				      function drawVisualization() {
				        // Some raw data (not necessarily accurate)
				        let data = google.visualization.arrayToDataTable([...res]);

				        let options = {
				          title : 'Monthly Coffee Production by Country',
				          vAxis: {title: 'Cups'},
				          hAxis: {title: 'Month'},
				          seriesType: 'bars',
				          series: {5: {type: 'line'}}
				        };

				        let chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
				        chart.draw(data, options);
				      }
				}
			});
		});
		
	});
</script>
</head>
<body>
	<button id="btn1">member JSON(text) 받아오기</button>
	<button id="btn2">member_list JSON(list) 받아오기</button>
	<button id="btn3">member_list JSON(table) 받아오기</button>
	<button id="btn4">카카오 맵에 보낼 데이터 받아오기</button>
	<button id="btn5">구글 차트에 보낼 받아오기</button>
	<hr color="red">
	
	<div id="result"></div>
</body>
</html>