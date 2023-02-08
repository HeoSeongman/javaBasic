package 조건문;

import java.util.Scanner;

public class 콘솔입력5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// 1.
		System.out.print("아이디를 입력하세요. => ");
		String id = scan.next();
		
		System.out.print("비밀번호를 입력하세요. => ");
		String pw = scan.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		// 2.
		System.out.print("구매할 사과의 갯수를 입력하세요 => ");
		int appleCount = scan.nextInt();
		
		System.out.print("사과의 개당 가격을 입력하세요. => ");
		int applePrice = scan.nextInt();
		
		System.out.print("구매할 딸기의 갯수를 입력하세요 => ");
		int berryCount = scan.nextInt();
		
		System.out.print("딸기의 개당 가격을 입력하세요. => ");
		int berryPrice = scan.nextInt();
		
		System.out.println("사과의 구매 가격은 " + (appleCount * applePrice) + "원 입니다.");
		System.out.println("딸기의 구매 가격은 " + (berryCount * berryPrice) + "원 입니다.");
		
		// 3.
		System.out.print("시작 값을 입력하세요. => ");
		int start1 = scan.nextInt();
		
		System.out.print("종료 값을 입력하세요. => ");
		int end1 = scan.nextInt();
		
		int sum1 = 0;
		for (int i = start1; i <= end1; i++) {
			sum1 += i;
		}
		System.out.println("시작 값과 종료 값 사이를 더한 값은 " + sum1 + "입니다.");
		
		// 4.
		System.out.print("시작 값을 입력하세요. => ");
		int start2 = scan.nextInt();
		
		System.out.print("종료 값을 입력하세요. => ");
		int end2 = scan.nextInt();
		
		System.out.print("점프 값을 입력하세요. => ");
		int jump2 = scan.nextInt();
		
		int sum2 = 0;
		for (int i = start2; i <= end2; i += jump2) {
			if (sum2 > 100) {
				break;
			}
			sum2 += i;
		}
		System.out.println("시작 값과 종료 값 사이를 더한 값은 " + sum2 + "입니다.");
		
		scan.close();
	}

}
