package 상속;

import java.util.Date;

import javax.swing.JLabel;

public class 타이머스레드 extends Thread {
	
	JLabel target;

	public 타이머스레드(JLabel target) {
		super();
		this.target = target;
	}

	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			target.setText(new Date().toString());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
