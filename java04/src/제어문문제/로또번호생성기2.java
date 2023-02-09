package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random random = new Random();
//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또 번호 : " + random.nextInt(45));
//		}
		
		// 2 ~ 10
//		Random random2 = new Random();
//		int begin2 = 2;
//		int end2 = 10 - begin2 + 1;
//		for (int i = 0; i < 10; i++) {
//			System.out.println("로또 번호 : " + (random2.nextInt(end2) + begin2));
//		}
		
		// 3 ~ 30
		Random random3 = new Random();
		int begin3 = 3;
		int end3 = 30 - begin3 + 1;
		for (int i = 0; i < 10; i++) {
			System.out.println("로또 번호 : " + (random3.nextInt(end3) + begin3));
		}
	}

}
