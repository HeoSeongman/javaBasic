package 조건문;

import java.util.Scanner;

public class 콘솔입력4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 => ");
		int age = scan.nextInt();
		System.out.println("내년 나이는 " + (age + 1) + "세");
		
		System.out.print("키를 입력 => ");
		double height = scan.nextDouble();
		System.out.println("당신의 키는 " + height);
		
		System.out.print("저녁을 먹었는지 입력(true/false) => ");
		boolean dinner = scan.nextBoolean();
		System.out.println("당신의 저녁 여부는 " + dinner);
		
		scan.nextLine();
		System.out.print("올해의 목표는 => ");
		String str = scan.nextLine();
		System.out.println("올해의 목표는 " + str);
		
		scan.close();
	}

}
