package 메서드연습;

public class 계산기 {
	
	public void plus(int a, int b) {
		System.out.println("더하기 기능 처리");
		System.out.println(a + b);
	}
	
	public void multiply(int a, int b, int c) {
		System.out.println("곱하기 기능 처리");
		System.out.println(a * b * c);
	}
	
	public int sub(int a, int b) {
		System.out.println("빼기 기능 처리");
		return a - b;
	}
}
