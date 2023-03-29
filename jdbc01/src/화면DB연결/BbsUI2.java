package 화면DB연결;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import 자바DB연결.BbsDAO;
import 자바DB연결.MemberDAO3;
import 자바DB연결.MemberVO;

public class BbsUI2 extends JFrame {
	
	public BbsUI2() {
		super("게시판화면");
		this.setSize(420, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.getContentPane().setBackground(Color.green);
		this.setLocationRelativeTo(null);
		
		Font font1 = new Font("맑은 고딕", Font.BOLD, 50);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 30);
		
		JLabel label1 = new JLabel("게시판 화면");
		label1.setFont(font1);
		label1.setOpaque(true);
		label1.setBorder(new EmptyBorder(50, 50, 50, 50));
		label1.setBackground(Color.white);
		
		JLabel label2 = new JLabel("번호");
		JLabel label3 = new JLabel("제목");
		JLabel label4 = new JLabel("내용");
		JLabel label5 = new JLabel("작성자");
		JTextField field2 = new JTextField(10);
		JTextField field3 = new JTextField(10);
		JTextField field4 = new JTextField(10);
		JTextField field5 = new JTextField(10);
		field2.setBackground(Color.yellow);
		field3.setBackground(Color.yellow);
		field4.setBackground(Color.yellow);
		field5.setBackground(Color.yellow);
		field2.setForeground(Color.red);
		field3.setForeground(Color.red);
		field4.setForeground(Color.red);
		field5.setForeground(Color.red);
		
		label2.setFont(font2);
		label3.setFont(font2);
		label4.setFont(font2);
		label5.setFont(font2);
		field2.setFont(font2);
		field3.setFont(font2);
		field4.setFont(font2);
		field5.setFont(font2);
		
		JButton button1 = new JButton("게시글 작성");
		JButton button2 = new JButton("게시글 삭제");
		JButton button3 = new JButton("게시글 수정");
		JButton button4 = new JButton("게시글 검색");
		button1.setFont(font2);
		button2.setFont(font2);
		button3.setFont(font2);
		button4.setFont(font2);
		
		this.add(label1);
		this.add(label2);
		this.add(field2);
		this.add(label3);
		this.add(field3);
		this.add(label4);
		this.add(field4);
		this.add(label5);
		this.add(field5);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);

		this.setVisible(true);
		

		button1.addActionListener(action -> {
			System.out.println("게시글 작성 버튼");
			String no = field2.getText();
			String title = field3.getText();
			String content = field4.getText();
			String writer = field5.getText();
			
			if (no.equals("")) {
				JOptionPane.showMessageDialog(this, "번호를 입력하세요.");
				return;
			}
			
			BbsDAO dao = new BbsDAO();
			int result = dao.insert(no, title, content, writer);
			if (result >= 1) {
				System.out.println("게시글 작성을 완료하였습니다.");
			} else {
				System.out.println("게시글 작성에 실패하였습니다.");
			}
		});
		
		button2.addActionListener(action -> {
			System.out.println("게시글 삭제 버튼");
			String no = field2.getText();
			
			if (no.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			BbsDAO dao = new BbsDAO();
			int result = dao.delete(no);
			
			if (result >= 1) {
				System.out.println("게시물 삭제에 성공하였습니다.");
			} else {
				System.out.println("게시물 삭제에 실패하였습니다.");
			}
		});
		
		button3.addActionListener(action -> {
			System.out.println("게시글 수정 버튼");
			String no = field2.getText();
			String content = field4.getText();
			
			if (no.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			if (content.equals("")) {
				JOptionPane.showMessageDialog(this, "내용을 입력하세요.");
				return;
			}
			
			BbsDAO dao = new BbsDAO();
			int result = dao.update(no, content);
			
			if (result >= 1) {
				System.out.println("게시글 수정에 성공하였습니다.");
			} else {
				System.out.println("게시글 수정에 실패하였습니다.");				
			}
		});
		
		button4.addActionListener(action -> {
			System.out.println("게시글 검색 버튼");
			String id = field2.getText();

			if (id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			BbsDAO dao = new BbsDAO();
			BbsVO result = dao.select(Integer.parseInt(id));
			
			if (result == null) {
				JOptionPane.showMessageDialog(this, "게시글 검색에 실패하였습니다.");
				field3.setText("");
				field4.setText("");
				field5.setText("");
			} else {
				field3.setText(result.getTitle());
				field4.setText(result.getContent());
				field5.setText(result.getWriter());
				field3.setBackground(Color.pink);
				field4.setBackground(Color.pink);
				field5.setBackground(Color.pink);
			}
		});

	}
}
