package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될 거야.");
		try {
			System.out.println("2. 문제 발생 코드 >> " + (10/0));			
		} catch (Exception e) {
			System.out.println("2. 에러 발생함.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("3. 프린트가 될까?");
	}

}
