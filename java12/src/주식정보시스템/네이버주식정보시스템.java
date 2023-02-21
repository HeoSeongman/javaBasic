package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버주식정보시스템 {
	
	static int index = 0;

	public static void main(String[] args) {
		String[] codes = {"005930", "000660", "035720", "067280"};
		
		JFrame frame = new JFrame("네이버 주식 정보 시스템");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(260, 400);
		frame.getContentPane().setBackground(Color.green);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		
		Font font1 = new Font("굴림체", Font.BOLD, 30);
		
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("하이닉스");
		JButton b3 = new JButton("카카오");
		JButton b4 = new JButton("멀티캠퍼스");
		JButton[] buttons = {b1, b2, b3, b4};
		
		JLabel codeLabel = new JLabel("CODE");
		JTextField codeField = new JTextField(10);
		JButton startCrawl = new JButton("크롤링 시작");
		
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.red);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.pink);
		startCrawl.setBackground(Color.darkGray);
		
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
//		b3.setForeground(Color.white);
		b4.setForeground(Color.white);
		startCrawl.setForeground(Color.white);
		
		codeLabel.setFont(font1);
		codeField.setFont(font1);
		startCrawl.setFont(font1);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.add(codeLabel);
		frame.add(codeField);
		frame.add(startCrawl);
		
		frame.setVisible(true);
		
		for (JButton btn : buttons) {
			btn.addActionListener(new ActionListener() {	
				int ii = index++;

				@Override
				public void actionPerformed(ActionEvent e) {
					codeField.setText(codes[ii]);
				}
			});
		}
		
		startCrawl.addActionListener(action -> {
			NaverCrawler c = new NaverCrawler();
			c.startCroll(codeField.getText());
		});
	}
	
}
