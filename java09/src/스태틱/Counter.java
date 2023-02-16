package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("카운터 프로그램");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		
		Font font = new Font("굴림체", Font.BOLD, 150);
		
		JButton minusBtn = new JButton("1 빼기");
		JButton zeroBtn = new JButton("0으로 초기화");
		JButton plusBtn = new JButton("1 더하기");
		minusBtn.setBackground(Color.green);
		plusBtn.setBackground(Color.green);
		zeroBtn.setBackground(Color.blue);
		
		minusBtn.setFocusable(false);
		plusBtn.setFocusable(false);
		zeroBtn.setFocusable(false);
		
		JLabel countLabel = new JLabel(String.valueOf(count));
		countLabel.setFont(font);
		countLabel.setForeground(Color.red);
		
		frame.add(minusBtn);
		frame.add(zeroBtn);
		frame.add(plusBtn);
		frame.add(countLabel); 
		
		frame.setVisible(true);
		
		minusBtn.addActionListener(action -> {
			count--;
			countLabel.setText(String.valueOf(count));
		});
		
		zeroBtn.addActionListener(action -> {
			count = 0;
			countLabel.setText(String.valueOf(count));
		});
		
		plusBtn.addActionListener(action -> {
			count++;
			countLabel.setText(String.valueOf(count));
		});
	}

}
