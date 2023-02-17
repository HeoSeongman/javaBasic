package 상속응용;

import java.util.Date;

public class 카운트스레드 extends Thread{

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("카운트 >> " + new Date());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}

	
}
