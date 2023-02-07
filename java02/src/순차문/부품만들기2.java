package 순차문;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(1200, 800);
		frame.setLayout(new FlowLayout());
		
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
		JLabel layer1 = new JLabel("아이디");
		JLabel layer2 = new JLabel("비밀번호");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("궁서", 1, 14);
		
		ImageIcon image1 = new ImageIcon("001.jpg");
		ImageIcon image2 = new ImageIcon("002.png");
		
		button1.setIcon(image1);
		button2.setIcon(image2);
		
		button1.setFont(font);
		button2.setFont(font);
		layer1.setFont(font);		
		layer2.setFont(font);
		
		button1.setBackground(Color.cyan);
		button2.setBackground(Color.MAGENTA);
		button1.setForeground(Color.red);
		button2.setForeground(Color.white);
		
		frame.add(layer1);
		frame.add(input1);
		frame.add(button1);
		
		frame.add(layer2);
		frame.add(input2);
		frame.add(button2);
		
		frame.setVisible(true);
	}

}
