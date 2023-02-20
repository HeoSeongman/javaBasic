package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {
	
	JLabel label;
	int x;
	int y;
	
	public MyThread(String file, int x, int y) {
		super();
		this.x = x;
		this.y = y;
		label = new JLabel(new ImageIcon(file));
		label.setBounds(x, y, 100, 100);
	}

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 200; i++) {
			x += random.nextInt(50);
			label.setBounds(x, y, 100, 100);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
