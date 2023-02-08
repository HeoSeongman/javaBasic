package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 반복문확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 400);
		
		Font font = new Font("굴림체", 1, 50);
		
		JButton button1 = new JButton("별 10개");
		JButton button2 = new JButton("커피*5");
		JButton button3 = new JButton("커피*우유3");
		JButton button4 = new JButton("1:짱!");
		
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);

		button1.setBackground(Color.pink);
		button2.setBackground(Color.cyan);
		button3.setBackground(Color.pink);
		button4.setBackground(Color.cyan);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		
		button1.addActionListener(action -> {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println("");
		});
		
		button2.addActionListener(action -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("커피*");
			}
			System.out.println("");
		});
		
		button3.addActionListener(action -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("커피*우유");
			}
		});
		
		button4.addActionListener(action -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println(i + " : 짱!");
			}
		});
		
		frame.setVisible(true);
	}

}
