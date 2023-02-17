package 스레드;

public class 손님접속스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "번 손님이 접속했습니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
