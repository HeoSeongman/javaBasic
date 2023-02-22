package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("나의 그래픽");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(500, 600);
		frame.getContentPane().setBackground(Color.green);
		frame.setLayout(new FlowLayout());
		
		Font font1 = new Font("굴림체", Font.BOLD, 50);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.orange);
		btn1.setFont(font1);
		
		frame.add(btn1);
		
		frame.setVisible(true);
		
		btn1.addActionListener(action -> {
			System.out.println("버튼이 눌려짐.");
		});
	}

}
