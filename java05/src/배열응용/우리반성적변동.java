package 배열응용;

import java.util.Random;

public class 우리반성적변동 {

	public static void main(String[] args) {
		Random random = new Random(42);

		int length = 10000;
		int[] score1 = new int[length];
		int[] score2 = new int[length];

		for (int i = 0; i < length; i++) {
			score1[i] = random.nextInt(101);
			score2[i] = random.nextInt(101);
		}

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < length; i++) {
			if (score1[i] == score2[i]) {
				count1++;
			} else {
				count2++;
			}
		}

		System.out.println("1-2학기 성적이 동일한 학생 수는 " + count1 + "명 입니다.");
		System.out.println("1-2학기 성적이 동일하지 않는 학생 수는 " + count2 + "명 입니다.");

		// 2학기에 성적이 더 오른 학생은 몇명? 누구?
		// 1학기에 성적이 더 좋았던 학생은 몇명? 누구?

		int count3 = 0, count4 = 0;
		
		for (int i = 0; i < length; i++) {
			if (score2[i] > score1[i]) {
				count3++;
			}
			else if (score1[i] > score2[i]) {
				count4++;
			}
		}

		System.out.println("2학기에 성적이 더 오른 학생 수는 " + count3 + "명 입니다.");
		System.out.println("1학기에 성적이 더 좋았던 학생 수는 " + count4 + "명 입니다.");
		
	}
}
