package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu = 0, bts = 0, jeans = 0;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스  4)종료 => ");
			int input = scan.nextInt();
			
			if (input == 4) { // 입력된 값이 4가 들어왔을 때 종료
				System.out.println("\n시스템을 종료합니다.");
				break;
			} else {
				if (input == 1) {
					iu++; // 1 일 때 아이유 누적			
				} else if (input == 2) {
					bts++; // 2 일 때 방탄 누적
				} else if (input == 3) {
					jeans++; // 3 일 때 뉴진스 누적
				}
			}
		}
		
		System.out.println("-----------------------");
		System.out.println("아이유 " + iu + "표");
		System.out.println("방탄 " + bts + "표");
		System.out.println("뉴진스 " + jeans + "표");
		System.out.println("-----------------------");
		
		scan.close();
	}

}
