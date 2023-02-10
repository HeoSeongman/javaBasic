package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블핑" };
		int[] term1 = { 77, 88, 99, 55, 70 }; // 1학기
		int[] term2 = { 99, 100, 88, 80, 70 }; // 2학기

		// 1. 2학기 성적이 오른 학생은 몇 명?
		// 2. 1학기, 2학기 성적이 동일한 학생은 몇 명?
		int greater2 = 0, same = 0, term1Sum = 0, term2Sum = 0;
		
		for (int i = 0; i < length; i++) {
			if (term1[i] < term2[i]) { // 2학기 성적이 클 때
				greater2++;
			} else if (term1[i] == term2[i]) { // 아니고 1,2학기 성적이 같을 때
				same++;
			}
			
			term1Sum += term1[i]; // 1학기 성적 누적
			term2Sum += term2[i]; // 2학기 성적 누적
		}

		System.out.println("2학기 성적이 오른 학생은 " + greater2 + "명 입니다.\n");
		System.out.println("1, 2학기 성적이 동일한 학생은 " + same + "명 입니다.\n");

		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		for (int i = 0; i < length; i++) {
			if (term2[i] == 100) {
				System.out.println("만점인 학생의 이름은 " + names[i] + "이고, 번호는 " + (i + 1) + "번 입니다.");
			}
		}
		System.out.println("");

		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		double term1Aver =((double)term1Sum / length) ; 
		double term2Aver =((double)term2Sum / length);  
		if (term1Aver > term2Aver) {
			System.out.println("1학기 평균이 더 높습니다.\n");
		} else if (term1Aver < term2Aver){
			System.out.println("2학기 평균이 더 높습니다.\n");	
		} else {
			System.out.println("1학기 2학기 평균이 같습니다.\n");
		}
			
		// 5. 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 1학기 성적은 " + term1[i] + "점 입니다.");
				System.out.println("뉴진스의 2학기 성적은 " + term2[i] + "점 입니다.");
				break;
			}
		}

	}

}
