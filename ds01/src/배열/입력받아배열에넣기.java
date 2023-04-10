package 배열;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 33) {
				System.out.println("33인 인덱스 : " + i);
			}
		}
		
		sc.close();
	}

}
