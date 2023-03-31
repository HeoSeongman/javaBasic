<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>news.jsp</title>
<style type="text/css">
	body {
		font-size: 30px;
	}
	
	input {
		font-size: 30px;
	}
	
	button {
		font-size: 30px;
	}
</style>
</head>
<body>
	<p>뉴스사이트</p>
	<hr color="red"/>
	
	<p>"좀 빨리 왔어요" 욱수골 벚꽃</p>
	<p>관측 이후 두 번째로 빨랐던 대구의 벚꽃 개화···욱수골 수놓은 벚꽃의 모습</p>
	<p>
	'공식적으로' 대구에서는 3월 21일부터 벚꽃이 피기 시작했습니다. 평년보다 8일이나 빠른, 벚꽃 관측을 '공식적으로' 시작한 1924년 이후 두 번째로 빨랐습니다. 통상적으로 벚꽃은 개화 후 일주일이 지나면 만개하는 만큼, 절정에 달한 2023년 벚꽃 모습은 이번 주말이 지나면 더 이상 보기 어려울 것 같은데요, 3월 28일 대구 수성구 욱수골을 수놓은 벚꽃의 모습입니다.
	</p>
	<hr color="orange"/>
	
	<%	String id = (String)session.getAttribute("id");
		if (id != null) { %>
	<form action="aaa">
		<p>댓글 : <input name="reply">
			<button>댓글달기</button>
		</p>
	</form>
	<% } %>
</body>
</html>