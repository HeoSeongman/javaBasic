package 제어문문제;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KPOP인기투표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
		frame.setSize(600, 800);
		frame.setTitle("K-POP 인기 투표 창");
		frame.setLayout(new FlowLayout());
		
		Font font1 = new Font("굴림체", 1, 60);
		Font font2 = new Font("굴림체", 1, 20);
		
		JLabel title = new JLabel("K-POP 인기 투표");
		title.setFont(font1);
		
		ImageIcon image1 = new ImageIcon("./lilac.jpg");
		JLabel titleLabel1 = new JLabel("1. 아이유 - 라일락");
		titleLabel1.setFont(font2);
		JLabel countLabel1 = new JLabel("0표");
		countLabel1.setFont(font2);		
		JButton button1 = new JButton(image1);
		
		ImageIcon image2 = new ImageIcon("./wego.jpg");
		JLabel titleLabel2 = new JLabel("2. 프로미스나인 - WE GO");
		titleLabel2.setFont(font2);
		JLabel countLabel2 = new JLabel("0표");
		countLabel2.setFont(font2);
		JButton button2 = new JButton(image2);
		
		ImageIcon image3 = new ImageIcon("./asap.jpg");
		JLabel titleLabel3 = new JLabel("3. 스테이씨 - ASAP");
		titleLabel3.setFont(font2);
		JLabel countLabel3 = new JLabel("0표");
		countLabel3.setFont(font2);
		JButton button3 = new JButton(image3);
		
		frame.add(title);
		
		frame.add(button1);
		frame.add(titleLabel1);
		frame.add(countLabel1);
		
		frame.add(button2);
		frame.add(titleLabel2);
		frame.add(countLabel2);
		
		frame.add(button3);
		frame.add(titleLabel3);
		frame.add(countLabel3);
		
		frame.setVisible(true);
		
		// 익명 객체 와 람다식이 그냥 같은 줄 알았는데
		// 람다식은 정말로 '식'만 사용할 때
		// 익명 객체는 내부 변수도 선언하고(상태를 가지고) 사용해야할 때
		// 로 생각해 볼 수 있다.
		button1.addActionListener(new ActionListener() {
			int iu = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				iu++;
				countLabel1.setText(iu + "표");
			}
		});
		
		button2.addActionListener(new ActionListener() {
			int wego = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				wego++;
				countLabel2.setText(wego + "표");
			}
		});
		
		button3.addActionListener(new ActionListener() {
			int asap = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				asap++;
				countLabel3.setText(asap + "표");
			}
		});
		
	}

}
