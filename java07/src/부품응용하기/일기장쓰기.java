package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	
	public void create(JFrame parentFrame) {
		
		JFrame frame = new JFrame("일기장 작성화면");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 700);
		frame.getContentPane().setBackground(Color.yellow);
		frame.setLayout(new FlowLayout());
		frame.setResizable(false);
		
		Font font1 = new Font("굴림체", 1, 20);
		Font font2 = new Font("굴림체", 1, 50);
		
		JLabel day = new JLabel("오늘의 날짜 : ");
		JLabel title = new JLabel("오늘의 제목 : ");
		JLabel content = new JLabel("오늘의 내용 : ");
		day.setFont(font1);
		title.setFont(font1);
		content.setFont(font1);
		
		JTextField dayText = new JTextField(34);
		JTextField titleText = new JTextField(34);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font1);
		titleText.setFont(font1);
		
		JTextArea contentText = new JTextArea(20, 34); // JTextArea(세로, 가로)
		contentText.setFont(font1);
		
		JButton button1 = new JButton("파일로 저장");
		button1.setFont(font2);
		
		frame.add(day);
		frame.add(dayText);
		frame.add(title);
		frame.add(titleText);
		frame.add(content);
		frame.add(contentText);
		frame.add(button1);
		
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("창 종료됨");
				parentFrame.setVisible(true);
			}
		});
		
		// "파일로 저장" 버튼 행동
		button1.addActionListener(action -> {
			String dayStr = dayText.getText();
			String titleStr = titleText.getText();
			String contentStr = contentText.getText();
			
			System.out.println(dayStr + "\n" + titleStr + "\n" + contentStr);
			try {
				FileWriter writer = new FileWriter("diary.txt");
				writer.write(dayStr + "\n" + titleStr + "\n" + contentStr);
				writer.close();
			} catch (IOException e1) {
				System.out.println("파일로 저장할 때 문제가 생김.");
			}
		});
	}
}
