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

import 자바DB연결.MemberDAO2;

public class MemberUI {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Member App");
		frame.setSize(450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.getContentPane().setBackground(Color.green);
		frame.setLocationRelativeTo(null);
		System.out.println(frame.getContentPane().toString());
		
		Font font1 = new Font("맑은 고딕", Font.BOLD, 50);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 30);
		
		JLabel label1 = new JLabel("회원가입 화면");
		label1.setFont(font1);
		label1.setOpaque(true);
		label1.setBorder(new EmptyBorder(50, 50, 50, 50));
		label1.setBackground(Color.white);
		
		JLabel label2 = new JLabel("아이디");
		JLabel label3 = new JLabel("패스워드");
		JLabel label4 = new JLabel("이름");
		JLabel label5 = new JLabel("전화번호");
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
		
		JButton button1 = new JButton("회원가입");
		JButton button2 = new JButton("회원탈퇴");
		JButton button3 = new JButton("회원수정");
		JButton button4 = new JButton("회원검색");
		button1.setFont(font2);
		button2.setFont(font2);
		button3.setFont(font2);
		button4.setFont(font2);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(field2);
		frame.add(label3);
		frame.add(field3);
		frame.add(label4);
		frame.add(field4);
		frame.add(label5);
		frame.add(field5);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);

		frame.setVisible(true);
		

		button1.addActionListener(action -> {
			System.out.println("회원가입처리 버튼");
			String id = field2.getText();
			String pw = field3.getText();
			String name = field4.getText();
			String tel = field5.getText();
			
			if (id.equals("")) {
				JOptionPane.showMessageDialog(frame, "아이디를 입력하세요.");
				return;
			}
			
			MemberDAO2 dao = new MemberDAO2();
			
			if (dao.insert(id, pw, name, tel) >= 1) {
				JOptionPane.showMessageDialog(frame, "회원가입이 완료되었습니다.");
			} else {
				JOptionPane.showMessageDialog(frame, "회원가입에 실패하였습니다.");
			}
		});
		
		button2.addActionListener(action -> {
			System.out.println("회원탈퇴처리 버튼");
			String id = field2.getText();
			
			if (id.equals("")) {
				JOptionPane.showMessageDialog(frame, "아이디를 입력하세요.");
				return;
			}
			
			MemberDAO2 dao = new MemberDAO2();
			dao.delete(id);
		});
		
		button3.addActionListener(action -> {
			System.out.println("회원수정처리 버튼");
			String id = field2.getText();
			
			if (id.equals("")) {
				JOptionPane.showMessageDialog(frame, "아이디를 입력하세요.");
				return;
			}
			
			String[] options = {"PW", "NAME", "TEL"};
			Object selectOption = JOptionPane.showInputDialog(frame, "선택하세요.", "옵션 창", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			if (selectOption == null) { // 창을 닫거나 취소했을 때
				return;
			}
			
			String value = null;
			switch(selectOption.toString()) {
			case "PW" : value = field3.getText(); break;
			case "NAME" : value = field4.getText(); break;
			case "TEL" : value = field5.getText(); break;
			}
			
			if (value.equals("")) {
				JOptionPane.showMessageDialog(frame, "수정할 항목을 입력하세요.");
				return;
			}
			
			MemberDAO2 dao = new MemberDAO2();
			dao.update(id, selectOption.toString(), value);			
		});
		
		button4.addActionListener(action -> {
			System.out.println("회원검색처리 버튼");
			String id = field2.getText();

			if (id.equals("")) {
				JOptionPane.showMessageDialog(frame, "아이디를 입력하세요.");
				return;
			}
			
			MemberDAO2 dao = new MemberDAO2();
			ResultSet result = dao.select(id);
			if (result == null) {
				JOptionPane.showMessageDialog(frame, "회원 검색에 실패하였습니다.");
				return;
			}
			
			try {
				JOptionPane.showMessageDialog(frame, "이름은 " + result.getString(1) + ", 전화번호는 " + result.getString(2) + " 입니다.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

}
