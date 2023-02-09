package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 600);
		frame.setResizable(false);
		
		Font font1 = new Font("굴림체", 1, 30);
		Font font2 = new Font("굴림체", 1, 80);
		
		JLabel label1 = new JLabel("아이디");
		label1.setFont(font1);
		
		JLabel label2 = new JLabel("비밀번호");
		label2.setFont(font1);
		
		JTextField input1 = new JTextField(20);
		input1.setFont(font1);
		input1.setBackground(Color.gray);
		input1.setForeground(Color.white);
		
		JTextField input2 = new JTextField(20);
		input2.setFont(font1);
		input2.setBackground(Color.gray);
		input2.setForeground(Color.white);
		
		JButton button = new JButton("로그인");
		button.setFont(font2);
		button.setBackground(Color.green);
		button.setForeground(Color.white);
		
		JLabel loginResult = new JLabel();
		loginResult.setFont(font1);
		
		frame.add(label1);
		frame.add(input1);
		frame.add(label2);
		frame.add(input2);
		frame.add(button);
		frame.add(loginResult);
				
		frame.setVisible(true);
		
		button.addActionListener(action -> {
			String id = input1.getText();
			String pw = input2.getText();
			
			if (id.equals("root") && pw.equals("1234")) {
//				JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
				loginResult.setText("로그인에 성공했습니다.");
			} else {
//				JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
				loginResult.setText("로그인에 실패했습니다.");
			}
		});
	}

}
