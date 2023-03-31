<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member.jsp</title>
<script type="text/javascript" src="./resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript"></script>
</head>
<body>
	<p>회원 가입 화면입니다.</p>
	<hr color="red">
	<form action="member_insert" method="get">
		<p>아이디 : <input name="id" value="id_test111"></p>
		<p>비밀번호 : <input name="pw" value="pw_test111"></p>
		<p>이름 : <input name="name" value="name_test111"></p>
		<p>전화번호 : <input name="tel" value="tel_test111"></p>
		<button type="submit">서버로 전송</button>
	</form>
	
	<p>회원 수정 화면입니다.</p>
	<hr color="red">
	<form action="member_update" method="get">
		<p>아이디 : <input name="id" value="id_test111"></p>
		<p>전화번호 : <input name="tel" value="tel_test111"></p>
		<button type="submit">서버로 전송</button>
	</form>
	
	<p>회원 탈퇴 화면입니다.</p>
	<hr color="red">
	<form action="member_delete" method="get">
		<p>아이디 : <input name="id" value="id_test111"></p>
		<button type="submit">서버로 전송</button>
	</form>
	
	<p>회원 검색 화면입니다.</p>
	<hr color="red">
	<form action="member_select" method="get">
		<p>아이디 : <input name="id" value="id_test111"></p>
		<button type="submit">서버로 전송</button>
	</form>
	
	<p>전체 회원 검색 화면입니다.</p>
	<hr color="red">
	<form action="member_list" method="get">
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>