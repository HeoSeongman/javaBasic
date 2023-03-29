/*
package 조별과제;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class ExamReviewUI {
	
	static int count = 0;
	
	public static void open() {
		JFrame frame = new JFrame("시험 후기");
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		
		Font font1 = new Font("돋움", Font.BOLD, 50);
		Font font2 = new Font("돋움", Font.BOLD, 30);
		
		JLabel title = new JLabel("시험 후기 목록");
		title.setFont(font1);
		
		JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
		JScrollPane scroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
						  // new JScrollPane(스크롤뷰에 보여질 컴포넌트, 수직스크롤바 정책, 수평스크롤바 정책);
		
		ExamReviewDAO dao = new ExamReviewDAO();
		ArrayList<ExamReviewVO> reviewList = dao.getReviewList();
		
		ArrayList<JButton> btns = new ArrayList<JButton>();
		for (int i = 0; i < reviewList.size(); i++) {
			JButton itemBtn = new JButton(reviewList.get(i).getId() + " : " + reviewList.get(i).getTitle());
			itemBtn.setFont(font2);
			panel.add(itemBtn);
			btns.add(itemBtn);
			
			// 게시글 버튼 액션
			itemBtn.addActionListener(new ActionListener() {
				int index = count++;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new ExamReviewDetailUI(reviewList.get(index), String.valueOf(1));
				}
			});
		}
		
		JButton writeBtn = new JButton("게시글 작성");
		writeBtn.setFont(font2);
		
		frame.add(title);
		frame.add(scroll); // 프레임에 스크롤판 붙이기
		frame.add(writeBtn);
		
		if (scroll.getPreferredSize().getHeight() > 650 - (int)title.getPreferredSize().getHeight() - (int)writeBtn.getPreferredSize().getHeight()) {
			scroll.setPreferredSize(new Dimension(480, 640 - (int)title.getPreferredSize().getHeight() - (int)writeBtn.getPreferredSize().getHeight()));			
		} else {
			scroll.setPreferredSize(new Dimension(480, (int)scroll.getPreferredSize().getHeight()));
		}
		scroll.getVerticalScrollBar().setUnitIncrement(16); // 마우스로 스크롤 시 증가량
		
		frame.setVisible(true);
		
		// 게시글 작성 버튼
		writeBtn.addActionListener(action -> {
			new ExamReviewWriteUI(String.valueOf(1));
		});
	}
	
}
*/


// 새로 고침

package 조별과제;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ExamReviewListUI {
	
	static int count = 0;
	
	public static void open() {
		JFrame frame = new JFrame("시험 후기");
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		Font font1 = new Font("돋움", Font.BOLD, 50);
		Font font2 = new Font("돋움", Font.BOLD, 30);
		
		JLabel title = new JLabel("시험 후기 목록");
		title.setFont(font1);
		
		JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
		JScrollPane scroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
						  // new JScrollPane(스크롤뷰에 보여질 컴포넌트, 수직스크롤바 정책, 수평스크롤바 정책);		
		refreshBtns(panel, scroll);
		
		JButton writeBtn = new JButton("게시글 작성");
		JButton refreshBtn = new JButton("새로 고침");
		writeBtn.setFont(font2);
		refreshBtn.setFont(font2);
		
		refreshBtn.addActionListener(action -> {
			refreshBtns(panel, scroll);
		});
		
		frame.add(title);
		frame.add(scroll); // 프레임에 스크롤판 붙이기
		frame.add(writeBtn);
		frame.add(refreshBtn);
		
		scroll.getVerticalScrollBar().setUnitIncrement(16); // 마우스로 스크롤 시 증가량
		
		frame.setVisible(true);
		
		// 게시글 작성 버튼
		writeBtn.addActionListener(action -> {
			new ExamReviewWriteUI(String.valueOf(1));
		});
	}
	
	// 새로고침 버튼 액션
	public static void refreshBtns(JComponent panel, JScrollPane scroll) {
		ExamReviewDAO dao = new ExamReviewDAO();
		ArrayList<ExamReviewVO> reviewList = dao.getReviewList();
		
		Font font2 = new Font("돋움", Font.BOLD, 30);
		panel.removeAll();
		count = 0;
		
		ArrayList<JButton> btns = new ArrayList<JButton>();
		for (int i = 0; i < reviewList.size(); i++) {
			JButton itemBtn = new JButton(reviewList.get(i).getId() + " : " + reviewList.get(i).getTitle());
			itemBtn.setFont(font2);
			itemBtn.setHorizontalAlignment(JButton.LEFT);
			panel.add(itemBtn);
			btns.add(itemBtn);
			
			// 게시글 버튼 액션
			itemBtn.addActionListener(new ActionListener() {
				int index = count++;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if (reviewList.get(index).getId() == 0) {
						JOptionPane.showMessageDialog(panel, "삭제되었거나 없는 게시글입니다.");
						return;
					}
					new ExamReviewDetailUI(reviewList.get(index), String.valueOf(1));
				}
			});
		}

		if (scroll.getPreferredSize().getHeight() > 530) {
			scroll.setPreferredSize(new Dimension(480, 530));			
		} else {
			scroll.setPreferredSize(new Dimension(480, (int)scroll.getPreferredSize().getHeight()));
		}
		
		scroll.revalidate(); // 하위 요소 재탐색
		scroll.repaint(); // 다시 렌더
	}
}
