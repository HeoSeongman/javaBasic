package 배열복습;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(42);
		
		int[] score = new int[10000];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(1000)+1;
		}
		
		System.out.println("<======================정렬 전======================>");
		for (int x : score) {
			System.out.println(x);
		}
		
//		Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(score);
		
		System.out.println("<======================정렬 후======================>");
		for (int x : score) {
			System.out.println(x);
		}
		
		System.out.println("정렬 후 최소 값 : " + score[0]);
		System.out.println("정렬 후 최대 값 : " + score[score.length - 1]);
		
		int sum30 = 0;
		for (int i = 7000; i < score.length; i++) {
			sum30 += score[i];
		}
		System.out.println(sum30 / 3000.0);
		
		int sum301 = 0;
		for (int i = 0; i < 3000; i++) {
			sum301 += score[i];
		}
		System.out.println(sum301 / 3000.0);
		
		System.out.println(Arrays.toString(score));
	}

}
