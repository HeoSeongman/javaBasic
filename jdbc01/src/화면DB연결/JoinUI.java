package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import 자바DB연결.MemberDAO3;
import 자바DB연결.MemberVO;

public class JoinUI extends JFrame {

	public JoinUI() {
		super("회원가입화면");
		this.getContentPane().setBackground(Color.green);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 600);
		this.setResizable(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setLocationRelativeTo(null);
		
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
			System.out.println("회원가입처리 버튼");
			String id = field2.getText();
			String pw = field3.getText();
			String name = field4.getText();
			String tel = field5.getText();
			
			if (id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			MemberDAO3 dao = new MemberDAO3();
			MemberVO vo = new MemberVO();
			vo.setId(id);
			vo.setPw(pw);
			vo.setName(name);
			vo.setTel(tel);
			
			if (dao.insert(vo) >= 1) {
				JOptionPane.showMessageDialog(this, "회원가입이 완료되었습니다.");
			} else {
				JOptionPane.showMessageDialog(this, "회원가입에 실패하였습니다.");
			}
		});
		
		button2.addActionListener(action -> {
			System.out.println("회원탈퇴처리 버튼");
			String id = field2.getText();
			
			if (id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			MemberDAO3 dao = new MemberDAO3();
			dao.delete(id);
		});
		
		button3.addActionListener(action -> {
			System.out.println("회원수정처리 버튼");
			String id = field2.getText();
			
			if (id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			if (field5.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "전화번호를 입력하세요.");
				return;
			}
			
			MemberDAO3 dao = new MemberDAO3();
			MemberVO vo = new MemberVO();
			vo.setId(id);
			vo.setTel(field5.getText());
			
			dao.update(vo);			
		});
		
		button4.addActionListener(action -> {
			System.out.println("회원검색처리 버튼");
			String id = field2.getText();

			if (id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			
			MemberDAO3 dao = new MemberDAO3();
			MemberVO result = dao.select(id);
			if (result == null) {
				JOptionPane.showMessageDialog(this, "회원 검색에 실패하였습니다.");
				field3.setText("");
				field4.setText("");
				field5.setText("");
			} else {
				field3.setText(result.getPw());
				field4.setText(result.getName());
				field5.setText(result.getTel());
				field3.setBackground(Color.pink);
				field4.setBackground(Color.pink);
				field5.setBackground(Color.pink);
			}
		});
	}
}

