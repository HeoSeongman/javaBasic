package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.yellow);
		frame.setTitle("랜덤버튼배열2");
		
		int fWidth = 1200, fHeight = 800;
		frame.setSize(fWidth, fHeight);
		
		JButton[] buttons = new JButton[500];
		int bWidth = 120, bHeight = 30;
		
		Random random = new Random(42);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
			buttons[i].setBounds(random.nextInt(fWidth - bWidth), random.nextInt(fHeight - (bHeight * 2)), bWidth, bHeight);
//			buttons[i].setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
			Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
			Color invColor = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
			buttons[i].setBackground(color);
			buttons[i].setForeground(invColor);
			frame.add(buttons[i]);
		}
		
		frame.setVisible(true);
	}

}
