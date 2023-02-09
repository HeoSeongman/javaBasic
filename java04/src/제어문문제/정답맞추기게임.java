package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int target = random.nextInt(100);
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0, count = 0;
		while (true) {
			System.out.print("생각한 정답은?? ");
			input = scan.nextInt();
			count++;
			
			if (input == target) {
				System.out.println("\n정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
//				System.out.println("오답입니다.");
//				System.out.println("다시 시도해주세요.");
				if (input > target) {
					System.out.println("Down");
				} else {
					System.out.println("Up");
				}
			}
		}
		
		System.out.println("\n시도한 횟수는 " + count + "회 입니다.");
		scan.close();
	}

}
