package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ID / PW / NAME / TEL 순으로 입력하세요.");
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();
		
		MemberDAO2 m = new MemberDAO2();
		m.insert(id, pw, name, tel);
	}
}
