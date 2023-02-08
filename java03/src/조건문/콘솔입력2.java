package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나에 대한 정보.");
		System.out.println("------------------------------");
		
		System.out.print("이름을 입력하세요 => ");
		String name = scan.next();
		
		System.out.print("나이를 입력하세요 => ");
		int age = scan.nextInt();
		
		System.out.print("취미를 입력하세요 => ");
		String hab = scan.next();
		
		System.out.println("------------------------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 취미는 " + hab + "입니다.!");
		
		scan.close();
	}

}
