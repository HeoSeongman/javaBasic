package 상속응용;

public class 입력스레드 extends Thread {
	char c;
	int count;

	public 입력스레드(char c, int count) {
		super();
		this.c = c;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {		
			System.out.println(c + "스레드");
		}
	}
	
	
}
