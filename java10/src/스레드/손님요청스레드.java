package 스레드;

public class 손님요청스레드 extends Thread {

	@Override
	public void run() {
		String[] str = { "사이다 요청.", "콜라 요청", "키보드 닦아주세요.", "렉 걸렸어요.", "자리가 더러워요." };
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
