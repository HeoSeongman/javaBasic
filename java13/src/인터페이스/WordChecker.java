package 인터페이스;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class WordChecker {

	public static void main(String[] args) {
		JFrame frame = new JFrame("글자/단어 길이 판독기");
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
//		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		Font font1 = new Font("굴림체", Font.BOLD, 20);
		
		JLabel charLabel = new JLabel("글자 수 : ");
		JLabel charResult = new JLabel();
		
		JTextArea inputArea = new JTextArea(16, 50);
		inputArea.setBackground(Color.darkGray);
		inputArea.setForeground(Color.white);
		inputArea.setFont(font1);
		inputArea.setCaretColor(Color.white);
		inputArea.setLineWrap(true); // 글자가 영역을 넘어갈 경우 줄바꿈 할지?
		
		JButton checkBtn = new JButton("검사");
		JButton padColBtn = new JButton("바탕색 변경");
		JButton textColBtn = new JButton("문자색 변경");
		JButton curColBtn = new JButton("커서색 변경");
		
		charLabel.setFont(font1);
		charResult.setFont(font1);
		checkBtn.setFont(font1);
		padColBtn.setFont(font1);
		textColBtn.setFont(font1);
		curColBtn.setFont(font1);
		
		frame.add(charLabel);
		frame.add(charResult);
		frame.add(inputArea);
		frame.add(checkBtn);
		frame.add(padColBtn);
		frame.add(textColBtn);
		frame.add(curColBtn);
		
		frame.setVisible(true);
		
		checkBtn.addActionListener(action -> {
			String str = inputArea.getText();
			str = str.replace("\n", "");
			inputArea.setText(str);
			
			str = str.replace(" ", "");
			charResult.setText(String.valueOf(str.length()) + "개");
		});
		
		padColBtn.addActionListener(action -> {
			Random random = new Random();
			inputArea.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		});
		
		textColBtn.addActionListener(action -> {
			Random random = new Random();
			inputArea.setForeground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		});
		
		curColBtn.addActionListener(action -> {
			Random random = new Random();
			inputArea.setCaretColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
			inputArea.requestFocus(); // 포커스 요청
		});
	}

//	이것은 글
//	자 단어 길
//	이 판독기
//	입니다.
//	사용해주
//	셔서
//	감사합
//	니다.
	
}
