package 자바DB연결;

import java.util.Scanner;

public class 게시판수정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---게시판 수정---");
		System.out.println("NO / COLUMN / DATA 순으로 입력하세요.");
		String no = sc.next();
		String column = sc.next();
		String data = sc.next();
		
		BbsDAO bbs = new BbsDAO();
		sc.close();
	}

}
