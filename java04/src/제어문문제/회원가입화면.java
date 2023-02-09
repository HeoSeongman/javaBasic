package 제어문문제;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class 회원가입화면 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("나의 회원가입 화면");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
//		frame.getContentPane().setBackground(Color.green);
		frame.setResizable(false);
		
		Font font1 = new Font("굴림체", 1, 30);
		Font font2 = new Font("굴림체", 1, 80);
		
		Border border1 = BorderFactory.createLineBorder(Color.black, 1);
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.green);
		
		JLabel title = new JLabel("회원가입");
		title.setFont(font2);
		title.setForeground(Color.white);
		
		panel1.setBorder(border1);
		panel1.add(title);
		
		JLabel label1 = new JLabel("아이디");
		label1.setFont(font1);
		
		JLabel label2 = new JLabel("비밀번호");
		label2.setFont(font1);
		
		JLabel label3 = new JLabel("이름");
		label3.setFont(font1);
		
		JLabel label4 = new JLabel("전화번호");
		label4.setFont(font1);
		
		JTextField input1 = new JTextField(20);
		input1.setFont(font1);
		input1.setBackground(Color.yellow);
		input1.setForeground(Color.red);
		
		JTextField input2 = new JTextField(20);
		input2.setFont(font1);
		input2.setBackground(Color.yellow);
		input2.setForeground(Color.red);
				
		JTextField input3 = new JTextField(20);
		input3.setFont(font1);
		input3.setBackground(Color.yellow);
		input3.setForeground(Color.red);
		
		JTextField input4 = new JTextField(20);
		input4.setFont(font1);
		input4.setBackground(Color.yellow);
		input4.setForeground(Color.red);
		
		JButton join = new JButton("회원가입처리");
		join.setFont(font1);
		join.setBackground(Color.pink);
		
		frame.add(panel1);
		frame.add(label1);
		frame.add(input1);
		frame.add(label2);
		frame.add(input2);
		frame.add(label3);
		frame.add(input3);
		frame.add(label4);
		frame.add(input4);
		frame.add(join);
		
		frame.setVisible(true);
		
		join.addActionListener(action -> {
			StringBuffer str = new StringBuffer();
			str.append(input1.getText() + "\n");
			str.append(input2.getText() + "\n");
			str.append(input3.getText() + "\n");
			str.append(input4.getText());
			
			if (JOptionPane.showConfirmDialog(null, str, "회원가입처리 확인", 0) == 0) {
				JOptionPane.showMessageDialog(null, "가입이 정상적으로 처리되었습니다.");				
			}
		});
	}

}
