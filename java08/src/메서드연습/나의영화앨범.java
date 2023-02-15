package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의영화앨범 {
	
	static int index = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] titles = { "타이타닉", "어메리징 모리스", "더 퍼스트 슬랭덩크", "아바타 : 물의 길", "교섭" };

		String[] imgs = { "./001.jpg", "./002.jpg", "./003.jpg", "./004.jpg", "./005.jpg" };

		double[] scores = { 9.72, 8.67, 9.28, 8.82, 6.26 };
		
		
		JFrame frame = new JFrame("나의 영화 앨범");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500, 600);
		frame.getContentPane().setBackground(Color.orange);
		frame.setLocationRelativeTo(null); // 실행시 화면 중앙에 생성
		
		Font font1 = new Font("굴림체", 1, 50);
		
		JLabel title = new JLabel(titles[index]);
		
		JButton previous = new JButton("<<");
		JButton next = new JButton(">>");
		previous.setBackground(Color.green);
		next.setBackground(Color.green);
		
		ImageIcon img = new ImageIcon(imgs[index]);
		JLabel imgLabel = new JLabel(img);
		
		JLabel score = new JLabel(String.valueOf(scores[index]));
		
		title.setFont(font1);
		previous.setFont(font1);
		next.setFont(font1);
		score.setFont(font1);
		
		title.setHorizontalAlignment(JLabel.CENTER);
		previous.setHorizontalAlignment(JLabel.CENTER);
		next.setHorizontalAlignment(JLabel.CENTER);
		score.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(title, BorderLayout.NORTH);
		frame.add(previous, BorderLayout.WEST);
		frame.add(imgLabel, BorderLayout.CENTER);
		frame.add(next, BorderLayout.EAST);
		frame.add(score, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
		previous.addActionListener(action -> {
					
			if (index == 0) {
				index = scores.length - 1;
			} else {
				index--;
			}
			
			title.setText(titles[index]);
			imgLabel.setIcon(new ImageIcon(imgs[index]));
			score.setText(String.valueOf(scores[index]));
		});
		
		next.addActionListener(action -> {
			
			if (index == scores.length - 1) {
				index = 0;
			} else {
				index++;
			}
			
			title.setText(titles[index]);
			imgLabel.setIcon(new ImageIcon(imgs[index]));
			score.setText(String.valueOf(scores[index]));
		});
	}

}
