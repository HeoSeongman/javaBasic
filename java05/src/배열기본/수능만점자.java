package 배열기본;

import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(42);

		int number = 10000, maxScore = 450;
		int[] students = new int[number];

		for (int i = 0; i < number; i++) {
			students[i] = random.nextInt(maxScore + 1);
		}

		// 1.
		int maxCount = 0;

		for (int i = 0; i < number; i++) {
			if (students[i] == maxScore) { // 학생의 점수가 만점과 같다면
				System.out.print(i + " ");
				maxCount++;
			}
		}

		System.out.println("\n만점자는 총 " + maxCount + "명 입니다.\n");

		// 2.
		int zeroCount = 0;

		for (int student : students) {
			if (student == 0) { // 학생의 점수가 0 이라면
				zeroCount++;
			}
		}

		System.out.println("0점을 맞은 응시자는 " + zeroCount + "명 입니다.\n");
		;

		// 3.
		int sum = 0;

		for (int student : students) {
			sum += student; // 학생의 점수 누적
		}

		double average = (double) sum / students.length; // 평균 구하기

		System.out.printf("평균은 %.2f 점 입니다.\n\n", average);
//		System.out.println("평균은 " + average + "점 입니다.");

		// 4.
		int averCount = 0;

		for (int student : students) {
			if (student <= average + 50 && student >= average - 50) { // 학생의 점수가 평균보다 ±50 범위 안에 있다면
				averCount++;
			}
		}

		System.out.println("평균보다 ±50인 학생의 수는 " + averCount + "명 입니다.\n");

		// 5.
		double percent30 = (double) maxScore * 7 / 10;
		int count30 = 0, sum30 = 0;

		for (int student : students) {
			if (student >= percent30) {
				count30++;
				sum30 += student;
			}
		}

		System.out.println("상위 30% 범위에 있는 학생은 " + count30 + "명 입니다.");
		System.out.printf("상위 30%% 평균은 %.2f 입니다.", (double) sum30 / count30);
	}

}
