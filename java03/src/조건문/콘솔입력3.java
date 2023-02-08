package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나의 이름은? : ");
		String name = scan.next(); // 단어 입력
		
		System.out.print("나의 키는? : ");
		double height = scan.nextDouble();
		
		System.out.print("나의 몸무게는? : ");
		double weight = scan.nextDouble();
		
		System.out.print("나의 저녁을 먹었나요? : ");
		boolean dinner = scan.nextBoolean();
		
		System.out.print("나의 좌우명은? : ");
		scan.nextLine();
		String lr = scan.nextLine(); // 한 줄 입력
		
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (height + 11) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은 " + lr + "입니다.");
		
		scan.close();
	}

}
