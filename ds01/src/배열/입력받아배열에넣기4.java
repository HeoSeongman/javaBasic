package 배열;

import java.util.Scanner;

public class 입력받아배열에넣기4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				count++;
			}
		}
		
		System.out.println("22.2의 갯수는 " + count + "개 이다.");
		sc.close();
	}

}
