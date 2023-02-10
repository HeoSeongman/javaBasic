package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[99];
		
		Random random = new Random();
		
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(score.length) + 1;
		}
		
		for (int x : score) {
			System.out.println(x);
		}
	}

}
