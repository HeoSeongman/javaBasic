package 조별과제;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ExamReviewDetailUI extends JFrame {

	public ExamReviewDetailUI(ExamReviewVO reviewVO, String memberID) throws HeadlessException {
		this.setSize(500, 700);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		Font font1 = new Font("돋움", Font.BOLD, 50);
		Font font2 = new Font("돋움", Font.BOLD, 30);
		
		JLabel title = new JLabel("시험 후기 보기");
		
		ExamReviewDAO dao = new ExamReviewDAO();
		ExamReviewVO review = dao.getReview(reviewVO.getId());
		
		JTextField titleField = new JTextField(review.getTitle(), 15);
		JTextArea contentField = new JTextArea(review.getContent(), 14, 15);
		
		titleField.setBackground(Color.white);
		titleField.setBorder(new LineBorder(Color.gray));
		
		contentField.setLineWrap(true);
		contentField.setBorder(new LineBorder(Color.gray));
		
		titleField.setEditable(false);
		contentField.setEditable(false);
		
		JButton editBtn = new JButton("게시글 수정");
		JButton deleteBtn = new JButton("게시글 삭제");
		JPanel noEditPanel = new JPanel();
		noEditPanel.add(editBtn);
		noEditPanel.add(deleteBtn);
		
		JButton updateBtn = new JButton("수정하기");
		JButton cancelBtn = new JButton("취소하기");
		JPanel doEditPanel = new JPanel();
		doEditPanel.add(updateBtn);
		doEditPanel.add(cancelBtn);
		
		title.setFont(font1);
		titleField.setFont(font2);
		contentField.setFont(font2);
		editBtn.setFont(font2);
		deleteBtn.setFont(font2);
		updateBtn.setFont(font2);
		cancelBtn.setFont(font2);
		
		this.add(title);
		this.add(titleField);
		this.add(contentField);
		this.add(noEditPanel);
		
		this.setVisible(true);
		
		editBtn.addActionListener(action -> {
			if (!review.getWriter().equals(memberID)) {
				JOptionPane.showMessageDialog(this, "수정할 권한이 없습니다.");
				return;
			}
			
			this.remove(noEditPanel);
			this.add(doEditPanel);
			title.setText("시험 후기 수정");
			titleField.setEditable(true);
			contentField.setEditable(true);
			this.repaint();
		});
		
		deleteBtn.addActionListener(action -> {
			if (!review.getWriter().equals(memberID)) {
				JOptionPane.showMessageDialog(this, "삭제할 권한이 없습니다.");
				return;
			}
			
			if (JOptionPane.showConfirmDialog(this, "정말 삭제하시겠습니까?", "삭제 확정", JOptionPane.OK_OPTION) != 0) {
				return;
			}
			
			if (dao.delete(review.getId()) == 0) {
				JOptionPane.showMessageDialog(this, "삭제에 실패하였습니다.");
				return;
			}
			
			reviewVO.setId(0);
			this.dispose();
		});
		
		updateBtn.addActionListener(action -> {
			if (titleField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "제목을 입력하세요.");
				return;
			}
			if (contentField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "내용을 입력하세요.");
				return;
			}
			
			ExamReviewDAO updateDAO = new ExamReviewDAO();
			if (updateDAO.update(new ExamReviewVO(review.getId(), titleField.getText(), contentField.getText(), memberID)) == 0) {
				JOptionPane.showMessageDialog(this, "수정에 실패하였습니다.");
				return;
			}
			
			this.dispose();
		});
		
		cancelBtn.addActionListener(action -> {
			this.remove(doEditPanel);
			this.add(noEditPanel);
			title.setText("시험 후기 보기");
			titleField.setEditable(false);
			contentField.setEditable(false);
			
			titleField.setText(review.getTitle());
			contentField.setText(review.getContent());
			
			this.repaint();
		});
	}
	
	
}
