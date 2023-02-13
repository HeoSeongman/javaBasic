package 배열응용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginInput = JOptionPane.showInputDialog(null, "총 좌석 수를 입력하세요."); // 999 까지가 적당함.
		int length = 153;
		
		if (beginInput != null) {
			length = Integer.parseInt(beginInput);
			
		} else {
			System.exit(0);
		}
		
		JFrame frame = new JFrame("극장 예매 시스템");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(800, 1000);
		frame.setLayout(new FlowLayout());
		

		Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 50);
		Font font2 = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		Font font3 = new Font(Font.SANS_SERIF, Font.BOLD, 30);

		JLabel label1 = new JLabel("좌석을 선택해주세요.");
		label1.setFont(font1);
		frame.add(label1);

		JLabel result = new JLabel("좌석을 선택해주세요.");
		result.setForeground(Color.blue);
		result.setFont(font3);

		JButton[] buttons = new JButton[length];
		boolean[] seats = new boolean[length];
		

		JPanel panel1 = new JPanel(new GridLayout(0, 9, 10, 10));
		
		// new JScrollPane(스크롤뷰에 보여질 컴포넌트, 수직스크롤바 정책, 수평스크롤바 정책);
		JScrollPane scroll = new JScrollPane(panel1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame.add(scroll); // 프레임에 스크롤판 붙이기

		for (int i = 0; i < length; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].setFont(font2);
			panel1.add(buttons[i]);

			buttons[i].addActionListener(action -> {
//				result.setText(action.getActionCommand());
				int index = Integer.parseInt(action.getActionCommand()) - 1;
				
				if (seats[index]) {
					result.setText("이미 예약되어있는 좌석입니다.");
					result.setForeground(Color.red);
					
					if (JOptionPane.showConfirmDialog(frame, (index + 1) + "번 예약을 취소하시겠습니까?", "예약 취소 확인", JOptionPane.OK_CANCEL_OPTION) == 0) {
						seats[index] = false;
						panel1.getComponent(index).setForeground(Color.black);
						result.setText((index + 1) + "번 예약이 취소되었습니다.");
						result.setForeground(Color.blue);
					}
					
				} else {
					seats[index] = true;
					panel1.getComponent(index).setForeground(Color.red);
					result.setText((index + 1) + "번 좌석이 예약되었습니다.");
					result.setForeground(Color.blue);
				}

			});
		}

		frame.add(result);

		JButton total = new JButton("전체 예약 내역 조회");
		total.setBackground(Color.white);
		total.setFont(font1);

		total.addActionListener(action -> {
			int count = 0;
			
			for (boolean x : seats) {
				if (x) {
					count++;
				}
			}

			JOptionPane.showMessageDialog(frame, "예약된 좌석 수는 " + count + "개 이고,\n" + "총 결제 금액은 " + (count * 10000) + "원입니다.");
		});

		frame.add(total);
		
		scroll.setPreferredSize(new Dimension(scroll.getPreferredSize().width, 700)); // 가로는 유지, 세로는 700으로 고정
		scroll.getVerticalScrollBar().setUnitIncrement(16); // 마우스로 스크롤 시 증가량

		frame.setVisible(true);
	}

}
