package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[1000];
		
		Random random = new Random();
		
		int count = 0, target = 15, sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(19) + 2;
			if (score[i] >= target) {
				count++;
				sum += score[i];
			}
		}
		
		for (int x : score) {
			System.out.println(x);
		}
		
		System.out.println(target + " 이상 갯수 : " + count);
		System.out.println(target + " 이상 총합 : " + sum);
		
	}

}
