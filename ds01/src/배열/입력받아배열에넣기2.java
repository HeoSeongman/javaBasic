package 배열;

import java.util.Scanner;

public class 입력받아배열에넣기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2가 있는 위치 : " + i);
			} else if (numbers[i] == 33.3) {
				System.out.println("33.3가 있는 위치 : " + i);
			}
		}
	}

}
