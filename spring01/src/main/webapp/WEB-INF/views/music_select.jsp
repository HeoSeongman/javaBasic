<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>music_select.jsp</title>
<style type="text/css">
	body {
		background-color: lime;
		font-size: 30px;
	}
	
	button {
		font-size: 30px;
	}
</style>
</head>
<body>
	<p>음악 검색이 완료되었습니다.</p>
	<p>ID : ${vo.id }</p>
	<p>제목 : ${vo.name }</p>
	<p>가수 : ${vo.singer }</p>
	<p>장르 : ${vo.genre }</p>
	<p>앨범 : ${vo.album }</p>
	<hr color="red">
	
	<a href="music_update?id=${vo.id }"><button>수정</button></a>
	<a href="music_delete?id=${vo.id }"><button>삭제</button></a>
	<button id="delBtn">확인 후 삭제</button>
	<hr color="red">
	
	<a href="music.jsp"><button>홈으로</button></a>
	<a href="music_list"><button>목록으로</button></a>
</body>
<script type="text/javascript">
	document.getElementById("delBtn").addEventListener('click', () => {
		if (confirm("삭제하시겠습니까?")) {
			document.location.href = "music_delete?id=${vo.id }";
		}
	});
</script>
</html>