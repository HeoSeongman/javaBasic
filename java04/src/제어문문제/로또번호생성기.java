package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + random.nextInt(45));
		}
	}

}
