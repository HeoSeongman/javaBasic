package 배열기본;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		int sum = 0, target = 300, overSum = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요."));
			sum += score[i];

			if (score[i] >= target) { // 입력된 값이 300 이상일 때
				overSum += score[i];
			}
		}

		// 배열 요소 모두 출력
		for (int x : score) {
			System.out.print(x + " ");
		}
		System.out.println("");

		// 1.
		System.out.printf("평균 : %.1f\n", (float)sum / score.length);
		
		// 2.
		System.out.println(target + "이상인 숫자의 총 합 : " + overSum);
		
		// 3.
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= target) {
				System.out.print(i + " ");
			}
		}
	}
}
