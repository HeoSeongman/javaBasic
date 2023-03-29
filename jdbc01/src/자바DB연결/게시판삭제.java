package 자바DB연결;

import java.util.Scanner;

public class 게시판삭제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---게시판 삭제---");
		System.out.println("삭제할 NO 을 입력하세요.");
		String no = sc.next();
		
		BbsDAO bbs = new BbsDAO();
		bbs.delete(no);
		sc.close();
	}

}
