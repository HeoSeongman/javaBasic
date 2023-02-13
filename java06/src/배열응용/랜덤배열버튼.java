package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤배열버튼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		
		int fwidth = 800, fheight = 800;
		frame.setSize(fwidth, fheight);
		
		Random random = new Random(42);
		int width = 200, height = 50;
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < 200; i++) {
			buttons[i] = new JButton("버튼" + i);
			buttons[i].setBounds(random.nextInt(fwidth - width), random.nextInt(fheight - height), width, height);
			frame.add(buttons[i]);
		}
		
		frame.setVisible(true);
	}

}
