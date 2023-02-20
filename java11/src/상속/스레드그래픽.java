package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {

	JLabel count, image, time;
	
	public static void main(String[] args) {
		스레드그래픽 frame = new 스레드그래픽();
	}

	public 스레드그래픽() {
		setTitle("내 스레드 그래픽");
		setSize(500, 500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.green);
		
		count = new JLabel("갯수");
		image = new JLabel(new ImageIcon("./1.png"));
		time = new JLabel("날짜");
		
		Font font1 = new Font("굴림체", Font.BOLD, 30);
		count.setFont(font1);
		time.setFont(font1);
		
		add(count);
		add(image);
		add(time);
		
		
		카운트스레드2 countT = new 카운트스레드2();
		이미지스레드2 imageT = new 이미지스레드2();
		타이머스레드2 timeT = new 타이머스레드2();
		
		countT.start();
		imageT.start();
		timeT.start();
		
		setVisible(true);
	}

	public class 카운트스레드2 extends Thread{
		
		@Override
		public void run() {
			for (int i = 100; i > 0; i--) {
				count.setText("카운트 >> " + i);
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread{
		
		String[] images = {
				"./1.png",
				"./2.png",
				"./3.png",
				"./4.png",
				"./5.png"
		};
		
		@Override
		public void run() {			
			for (int i = 0; ;) {
				image.setIcon(new ImageIcon(images[i]));
				
				if (i+1 == images.length) {
					i = 0;
				} else {
					i++;
				}
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 100; i > 0; i--) {
				time.setText(new Date().toString());
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

}
