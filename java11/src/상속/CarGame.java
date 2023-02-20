package 상속;

import java.awt.Font;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	
	MyThread[] cars = new MyThread[3];
	int finishX = 400, count = 200;

	public static void main(String[] args) {
		CarGame game = new CarGame();
	}
	
	public CarGame() {
		setTitle("My Car Game");
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
//		MyThread car1 = new MyThread("./car01.png", 0, 0);
//		MyThread car2 = new MyThread("./car02.png", 0, 100);
//		MyThread car3 = new MyThread("./car03.png", 0, 200);
		
		for (int i = 0; i < 3; i++) {
			cars[i] = new MyThread("./car0" + (i + 1) + ".png", 0, i * 100);
		}
		
		MyCounter counter = new MyCounter(this);
		counter.start();
		
//		car1.start();
//		car2.start();
//		car3.start();
		
		setVisible(true);
	}
	
	public void finish(Icon image) {
		System.out.println("Finish called.");
		
		JLabel finishLabel = new JLabel("결승선 통과!!!");
		finishLabel.setBounds(0, 300, 500, 50);
		finishLabel.setFont(new Font("굴림체", Font.BOLD, 50));
		
		JLabel finishCarImage = new JLabel(image);
		finishCarImage.setBounds(0, 350, 100, 100);
		
		JLabel finishMessage = new JLabel("차량이 우승했습니다.!!");
		finishMessage.setFont(new Font("굴림체", Font.BOLD, 30));
		finishMessage.setBounds(100, 400, 500, 50);
		
		add(finishLabel);
		add(finishCarImage);
		add(finishMessage);
		this.repaint();
	}
	
	public class MyCounter extends Thread {
		
		CarGame parent;

		public MyCounter(CarGame parent) {
			super();
			this.parent = parent;
		}
		
		@Override
		public void run() {
			
			JLabel countLabel = new JLabel("");
			countLabel.setBounds(200, 200, 500, 300);
			countLabel.setFont(new Font("굴림체", Font.BOLD, 50));
			parent.add(countLabel);
			
			for (int i = 3; i > 0; i--) {
				countLabel.setText(String.valueOf(i));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			parent.remove(countLabel);
			parent.repaint();
			
			for (int i = 0; i < 3; i++) {
				cars[i].start();
			}
		}
		
	}
	
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
			add(label);
		}

		@Override
		public void run() {
			Random random = new Random();
			for (int i = 0; i < count; i++) {
				x += random.nextInt(10);
				label.setBounds(x, y, 100, 100);
				
				if (x >= finishX) {
					count = 0;
					finish(label.getIcon());
				}
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


}
