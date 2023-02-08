package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요일 입력\n1) 주중, 2) 주말 : ");
		int data1 = scan.nextInt();
		
		if (data1 == 1) {
			System.out.println("열심히 달리자.");
		} else {
			System.out.println("푹~~쉬자.");
		}
		
		System.out.println("주말에 뭐 할까?");
		String data2 = scan.next();
		System.out.println("나는 주말에 " + data2 + "를 할거야.");
		
		scan.close();
	}

}
