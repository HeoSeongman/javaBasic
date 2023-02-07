package 반복문;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
//		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(0, 10, 10, 10));
		
//		JButton button1 = new JButton("1");
//		
//		frame.add(button1);
		
		for (int i = 1; i <= 100; i++) {
			frame.add(new JButton(Integer.toString(i)));
		}
		
		frame.setVisible(true);
	}

}
