package 상속응용;

public class 이미지스레드 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] images = { "./1.png", "./2.png", "./3.png", "./4.png", "./5.png" };
		
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지 >> " + images[i]);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Thread.sleep() 실패!");
			}
		}
	}

}
