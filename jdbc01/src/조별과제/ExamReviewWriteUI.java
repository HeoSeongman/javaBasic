package 조별과제;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ExamReviewWriteUI extends JFrame {

	public ExamReviewWriteUI(String writerID) throws HeadlessException {
		this.setSize(500, 700);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		Font font1 = new Font("돋움", Font.BOLD, 50);
		Font font2 = new Font("돋움", Font.BOLD, 30);
		
		JLabel title = new JLabel("시험 후기 작성");
		title.setFont(font1);
		
		JTextField titleField = new JTextField(15);
		JTextArea contentField = new JTextArea(14, 15);
		contentField.setLineWrap(true);
		contentField.setBorder(new LineBorder(Color.gray));
		JButton writeBtn = new JButton("게시글 작성 완료");
		
		titleField.setFont(font2);
		contentField.setFont(font2);
		writeBtn.setFont(font2);
		
		this.add(title);
		this.add(titleField);
		this.add(contentField);
		this.add(writeBtn);
		
		this.setVisible(true);
		
		writeBtn.addActionListener(action -> {
			
			if (titleField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "제목을 입력하세요.");
				return;
			}
			if (contentField.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "내용을 입력하세요.");
				return;
			}
			
			
			ExamReviewDAO dao = new ExamReviewDAO();
			if (dao.insert(new ExamReviewVO(-1, titleField.getText().trim(), contentField.getText().trim(), writerID)) == 0) {
				JOptionPane.showMessageDialog(this, "등록에 실패하였습니다.");
				return;
			}
			
			this.dispose();
			// https://msource.tistory.com/3
		});
	}
}
