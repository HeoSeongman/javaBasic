package 배열기본;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("첫번째 값과 세번째 값을 더한 값 : " + (arr[0] + arr[2]) + "\n");
		
		// 2.
		String[] strArr = new String[3];
		for (int i = 0; i < 3; i++) {
			strArr[i] = scan.next();
		}
		
		System.out.println(strArr[0] + " 보다는 " + strArr[1]);
		
		scan.close();
	}

}
