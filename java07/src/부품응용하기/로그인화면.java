package 부품응용하기;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("나의 일기장");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 800);
		frame.setLayout(new FlowLayout());
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.green);
		
		Font font1 = new Font("굴림체", 1, 20);
		
		ImageIcon image = new ImageIcon("./memo.PNG");
		JLabel imageLabel = new JLabel(image);
		frame.add(imageLabel);
		
		JLabel idLabel = new JLabel("아 이 디 : ");
		JLabel pwLabel = new JLabel("비밀번호 : ");
		JTextField idField = new JTextField(20);
		JTextField pwField = new JTextField(20);
		
		idLabel.setFont(font1);
		pwLabel.setFont(font1);
		idField.setFont(font1);
		pwField.setFont(font1);
		
		ImageIcon icon1 = new ImageIcon("./LeftDown.png");
		ImageIcon icon2 = new ImageIcon("./RESET.png");
		
		JButton login = new JButton(new ImageIcon(icon1.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
		JButton reset = new JButton(new ImageIcon(icon2.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
		login.setBackground(Color.CYAN);
		reset.setBackground(Color.CYAN);
		
		frame.add(idLabel);
		frame.add(idField);
		frame.add(pwLabel);
		frame.add(pwField);
		frame.add(login);
		frame.add(reset);
		
		frame.setVisible(true);
		
		login.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String inputID = idField.getText();
				String inputPW = pwField.getText();
				
				if (inputID.equals("root") && inputPW.equals("1234")) {
					JOptionPane.showMessageDialog(frame, "로그인에 성공했습니다.");
					일기장쓰기 diary = new 일기장쓰기();
					diary.create(frame);
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "로그인에 실패했습니다.\n아이디 혹은 비밀번호를 확인하세요.");
				}				
			}
		});
		
		
		reset.addActionListener(action -> {
			idField.setText("");
			pwField.setText("");
		});
	}

}
