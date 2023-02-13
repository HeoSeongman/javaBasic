package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subjectNames = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] score1 = { 44, 66, 22, 99, 100 };
		int[] score2 = score1.clone();

//		System.out.println(score1 == score2); // 주소를 비교

		score2[0] = 22;
		score2[2] = 88;

		// 0
		System.out.println("전체 1, 2학기 성적 출력");
		System.out.print("학기\t");
		for (int i = 0; i < subjectNames.length; i++) {
			System.out.print(subjectNames[i] + "\t");
		}
		System.out.println();

		System.out.print("1\t");
		for (int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + "\t");
		}
		System.out.println();

		System.out.print("2\t");
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + "\t");
		}

		// 1
		int same = 0;
		for (int i = 0; i < score2.length; i++) {
			if (score1[i] == score2[i]) {
				same++;
			}
		}
		System.out.println("\n\n1, 2학기 성적 중 동일한 과목의 수는 " + same + "개 입니다.\n");

		// 2
		int over = 0;
		for (int i = 0; i < score2.length; i++) {
			if (score1[i] < score2[i]) {
				over++;
			}
		}
		System.out.println("1, 2학기 성적 중 상승한 과목의 수는 " + over + "개 입니다.\n");
		
		// 3
		for (int i = 0; i < score2.length; i++) {
			if (score1[i] < score2[i]) {
				System.out.println(subjectNames[i] + "\t");
			}
		}
	}

}
