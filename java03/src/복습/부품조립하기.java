package 복습;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setResizable(false);
		frame.setSize(600, 800);
		frame.setTitle("내가 생각한 숫자");
		
		Font font1 = new Font("굴림체", 1, 20);
		Font font2 = new Font("굴림체", 1, 30);
		
		JLabel label = new JLabel("당신이 생각한 숫자를 입력하세요.");
		label.setFont(font2);
		label.setForeground(Color.red);
		
		JTextField input1 = new JTextField(30);
		input1.setFont(font2);
		input1.setBackground(Color.cyan);
		input1.setForeground(Color.orange);
		
		JButton button = new JButton("확인");
		button.setFont(font1);
		button.setForeground(Color.pink);
		button.setBackground(Color.gray);
		
		frame.getContentPane().setBackground(Color.blue);
		frame.add(label);
		frame.add(input1);
		frame.add(button);
		
		frame.setVisible(true);
	}

}
