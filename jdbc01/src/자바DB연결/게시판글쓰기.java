package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---게시판 글쓰기---");
		System.out.println("NO / TITLE / CONTENT / WRITER 순으로 입력하세요.");
		
		String no = sc.next();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		BbsDAO bbs = new BbsDAO();
		bbs.insert(no, title, content, writer);
		sc.close();
	}

}
