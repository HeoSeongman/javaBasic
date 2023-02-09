package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] score = {10, 20, 30, 40};
//		System.out.println(score);
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score.length);
		
		// 1.
		int[] week = {1,2,3,4,5,6,7};
		
		// 2.
		System.out.println("첫번째 값 => " + week[0]);
		System.out.println("두번째 값 => " + week[1]);
		
		// 3.
		System.out.println("week 배열의 갯수 => " + week.length);
		
		// 4.
		week[2] = 10;
		week[4] = 12;
		
		// 5.
		System.out.println("세번째 값 => " + week[2]);
		System.out.println("다섯번째 값 => " + week[4]);
		
		// 6.
		int[] tour = new int[4];
		
		// 7.
		tour[0] = 20;
		tour[2] = 30;
		
		System.out.println("첫번쨰 인덱스 값 => " + tour[0]);
		System.out.println("세번쨰 인덱스 값 => " + tour[2]);
		
		// 8.
		System.out.println("tour 배열의 갯수 => " + tour.length);
	}

}
