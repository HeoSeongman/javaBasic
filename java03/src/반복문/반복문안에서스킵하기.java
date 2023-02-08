package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			
			if (i == 8) {
				break;
			}
			
			if (i % 2 != 0) { // 홀수는 건너뛰기
				continue;
			}
			System.out.println(i);
		}
		System.out.println("for문이 다 끝났다.");
	}

}
