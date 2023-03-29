function login() {
	let id2 = "root";
	let id = prompt("아이디 입력");
	if (id === id2) {
		alert("로그인 성공");
	} else {
		alert("로그인 실패");
	}
}

function compare() {
	let n1 = 100, n2 = 200;
	alert(n1 == n2);
	//console.log(n1 == n2);
	
	let friend = prompt("친구의 기분(굿, 별로, 나빠) 입력");
	let me = prompt("나의 기분(굿, 별로, 나빠) 입력");
	//console.log("친구의 나의 기분이 동일한지 판별.");
	alert(friend == me);
	console.log(friend == me);
}