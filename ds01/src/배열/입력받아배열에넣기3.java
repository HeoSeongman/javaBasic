package 배열;

import java.util.Scanner;

public class 입력받아배열에넣기3 {

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
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 33) {
				count++;
			}
		}
		
		System.out.println("33의 갯수는 " + count + "개 이다.");
		sc.close();
	}

}
