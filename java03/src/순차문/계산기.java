package 순차문;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel imageLabel = new JLabel();
		ImageIcon image = new ImageIcon("./Calculator.PNG");
		
		JLabel label1 = new JLabel("숫자1");
		JLabel label2 = new JLabel("숫자2");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Button button1 = new Button(" + ");
		Button button2 = new Button(" - ");
		Button button3 = new Button(" * ");
		Button button4 = new Button(" / ");
		
		Font font1 = new Font("굴림", 1, 30);
		Font font2 = new Font("굴림", 1, 50);
		
		imageLabel.setIcon(image);
		
		label1.setFont(font1);
		label2.setFont(font1);
		input1.setFont(font1);
		input2.setFont(font1);
		button1.setFont(font2);
		button2.setFont(font2);
		button3.setFont(font2);
		button4.setFont(font2);
		
		button1.setBackground(Color.lightGray);
		button2.setBackground(Color.lightGray);
		button3.setBackground(Color.lightGray);
		button4.setBackground(Color.lightGray);
		
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		panel1.add(input1);
		
		JPanel panel2 = new JPanel();
		panel2.add(label2);
		panel2.add(input2);
		
		JPanel panel3 = new JPanel();
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		panel3.add(button4);
		
		frame.add(imageLabel);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		
		frame.setVisible(true);
		
		button1.addActionListener(action -> {
			int num1 = Integer.parseInt(input1.getText());
			int num2 = Integer.parseInt(input2.getText());
			
			JOptionPane.showMessageDialog(null, num1 + num2);
		});
		
		button2.addActionListener(action -> {
			int num1 = Integer.parseInt(input1.getText());
			int num2 = Integer.parseInt(input2.getText());
			
			JOptionPane.showMessageDialog(null, num1 - num2);
		});
		
		button3.addActionListener(action -> {
			int num1 = Integer.parseInt(input1.getText());
			int num2 = Integer.parseInt(input2.getText());
			
			JOptionPane.showMessageDialog(null, num1 * num2);
		});
		
		button4.addActionListener(action -> {
			int num1 = Integer.parseInt(input1.getText());
			int num2 = Integer.parseInt(input2.getText());
			
			JOptionPane.showMessageDialog(null, (float)num1 / num2);
		});
	}

}
