package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 키오스크2 {
	
	static int count;
	static int total;
	static int[] eachCount = new int[4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menus = { "아메리카노", "아이스<br>아메리카노", "카페라떼", "캬라멜<br>마키아토" };
		int[] prices = { 4500, 5000, 5300, 5500 };
		JButton[] buttons = new JButton[menus.length];
		JLabel[] eachLabel = new JLabel[menus.length];
		
		JFrame frame = new JFrame("키오스크2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // 실행시 화면 중앙에
		frame.setSize(500, 700);
		frame.getContentPane().setBackground(Color.orange);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		Font font1 = new Font("굴림체", Font.BOLD, 30);
		
		JLabel top = new JLabel("메뉴를 선택해주세요.");
		top.setFont(font1);
		frame.add(top);
		
		JPanel menuGrid = new JPanel(new GridLayout(0, 2));
		menuGrid.setBackground(Color.orange);
		
		for (int i = 0; i < buttons.length; i++) { // for문으로 버튼 속성 등록
			buttons[i] = new JButton("<HTML><center>" + menus[i] + "<br>" + prices[i] + "원</HTML>");
			buttons[i].setFont(font1);
			buttons[i].setBackground(Color.yellow);
			menuGrid.add(buttons[i]);
			eachLabel[i] = new JLabel("0개 선택됨");
			eachLabel[i].setFont(font1);
			menuGrid.add(eachLabel[i]);
		}
		frame.add(menuGrid);
		
		JLabel countLabel = new JLabel("총 합계 수량 : ");
		JLabel countText = new JLabel(String.valueOf(count) + "개");
		countLabel.setFont(font1);
		countText.setFont(font1);
		
		JLabel totalLabel = new JLabel("총 합계 금액 : "); 
		JLabel totalText = new JLabel(String.valueOf(total) + "원");
		totalLabel.setFont(font1);
		totalText.setFont(font1);
		
		frame.add(countLabel);
		frame.add(countText);
		frame.add(totalLabel);
		frame.add(totalText);
		
		frame.setVisible(true);
		
		for (JButton button : buttons) { // for 문으로 버튼 이벤트 등록
			button.addActionListener(new ActionListener() {
				
				int index = count++; // 자기자신 인덱스 저장
				
				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					total += prices[index];
					eachCount[index]++;
					
					countText.setText(String.valueOf(count) + "개");
					totalText.setText(String.valueOf(total) + "원");
					eachLabel[index].setText(String.valueOf(eachCount[index]) + "개 선택됨");
				}
			});
		}
		count = 0; // 버튼 등록이 끝나면 0으로 초기화
	}

}
