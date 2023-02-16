package 문제2;

public class 우리집 {
	
	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", '여');
		딸 d2 = new 딸("홍길진", '여');
		
		딸.watchTV();
		System.out.println();
		
		// a.
		System.out.println("딸들의 정보 출력");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		// b.
		System.out.println("\n현재 딸이 몇명인지?");
		System.out.println(딸.children + "명");
		
		// c.
		System.out.println("\n현재 아빠의 지갑에 남은 돈");
		System.out.println(딸.fatherWallet);
	}
}
