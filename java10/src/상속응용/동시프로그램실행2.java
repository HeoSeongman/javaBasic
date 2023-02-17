package 상속응용;

public class 동시프로그램실행2 {
	
	public static void main(String[] args) {
		
		입력스레드 t1 = new 입력스레드('$', 1000);
		입력스레드 t2 = new 입력스레드('@', 1000);
		입력스레드 t3 = new 입력스레드('&', 1000);
		
		t1.run();
		t2.run();
		t3.run();
	}
	
	
}
