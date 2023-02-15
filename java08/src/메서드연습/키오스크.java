package 메서드연습;

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
import javax.swing.JTextField;

public class 키오스크 {
	
	static int count = 0;
	static int total = 0;
	static int[] countArr = new int[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menus = {"김밥", "떡볶이", "튀김모둠" }; // 음식 이름
		int[] prices = { 2000, 2500, 3000 }; // 음식 가격
		JButton[] buttons = new JButton[3];
		
		String[] images = { "./gimbap.PNG", "./Tteokbokki.PNG", "./fry.PNG" }; // 음식 사진 경로
		ImageIcon[] icons = new ImageIcon[3];
		
		Font font1 = new Font("굴림체", Font.BOLD, 30);

		JFrame frame = new JFrame("키오스크");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 840);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.green);
		
		for (int i = 0; i < menus.length; i++) { // 버튼 속성 설정
			buttons[i] = new JButton("<HTML><center>" + menus[i] + "<br>" + prices[i] + "</HTML>");
			buttons[i].setFont(font1);
			buttons[i].setPreferredSize(new Dimension(buttons[i].getPreferredSize().width, 80)); // 버튼의 가로는 유지, 세로는 80으로 설정
			buttons[i].setBackground(Color.DARK_GRAY);
			buttons[i].setForeground(Color.white);
			frame.add(buttons[i]);
		}
		
		JTextField countField = new JTextField(String.valueOf(count), 10);
		countField.setFont(font1);
		countField.setBackground(Color.yellow);
		countField.setForeground(Color.blue);
		
		JLabel countLabel = new JLabel("개수 : ");
		countLabel.setFont(font1);
		
		for (int i = 0; i < icons.length; i++) { // 크기 조절된 아이콘들을 배열에 미리 저장
			icons[i] = new ImageIcon(new ImageIcon(images[i]).getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)); // 이미지 크기 조절
		}
		
		JLabel imageLabel = new JLabel(icons[0]);
		
		JLabel paymentLabel = new JLabel("결제금액 : ");
		paymentLabel.setFont(font1);
		
		JLabel totalLabel = new JLabel(String.valueOf(total));
		totalLabel.setFont(font1);
		
		JLabel wonLabel = new JLabel("원");
		wonLabel.setFont(font1);
		
		JLabel eachLabel = new JLabel("김밥 : " + countArr[0] + "개, 떡볶이 : " + countArr[1] + "개, 튀김모둠 : " + countArr[2]);
		eachLabel.setFont(font1);
		
		frame.add(countLabel);
		frame.add(countField);
		frame.add(imageLabel);
		frame.add(paymentLabel);
		frame.add(totalLabel);
		frame.add(wonLabel);
		frame.add(eachLabel);
		
		frame.setVisible(true);
		
		for (JButton button : buttons) { // for문으로 버튼 이벤트 등록
			button.addActionListener(new ActionListener() {
				
				int index = count++; // 자기자신의 인덱스를 저장
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					imageLabel.setIcon(icons[index]);
					
					count++; // 총 합계 수량
					countField.setText(String.valueOf(count));
					
					total += prices[index]; // 총 합계 금액
					totalLabel.setText(String.valueOf(total));
					
					countArr[index]++; // 각 합계 수량
					eachLabel.setText("김밥 : " + countArr[0] + "개, 떡볶이 : " + countArr[1] + "개, 튀김모둠 : " + countArr[2] + "개");
				}
			});
		}		
		count = 0; // for문이 끝나면 0으로 초기화
		
//		아래는 각각 적용했을 때(for문으로 바꾸기 전 코드)
		
//		buttons[0].addActionListener(action -> {
//			imageLabel.setIcon(icons[0]);
////			countField.setText(String.valueOf(Integer.parseInt(countField.getText()) + 1));
////			totalLabel.setText(String.valueOf(Integer.parseInt(totalLabel.getText()) + 1000));
//			
//			count++; // 총 합계 수량
//			countField.setText(String.valueOf(count));
//			
//			total += prices[0]; // 총 합계 금액
//			totalLabel.setText(String.valueOf(total));
//			
//			countArr[0]++; // 각 합계 수량
//			eachLabel.setText("김밥 : " + countArr[0] + "개, 떡볶이 : " + countArr[1] + "개, 튀김모둠 : " + countArr[2] + "개");
//		});
//		
//		buttons[1].addActionListener(action -> {
//			imageLabel.setIcon(icons[1]);
////			countField.setText(String.valueOf(Integer.parseInt(countField.getText()) + 1));
////			totalLabel.setText(String.valueOf(Integer.parseInt(totalLabel.getText()) + 1000));
//			
//			count++;
//			countField.setText(String.valueOf(count));
//			
//			total += prices[1];
//			totalLabel.setText(String.valueOf(total));
//			
//			countArr[1]++;
//			eachLabel.setText("김밥 : " + countArr[0] + "개, 떡볶이 : " + countArr[1] + "개, 튀김모둠 : " + countArr[2] + "개");
//		});
//		
//		buttons[2].addActionListener(action -> {
//			imageLabel.setIcon(icons[2]);
////			countField.setText(String.valueOf(Integer.parseInt(countField.getText()) + 1));
////			totalLabel.setText(String.valueOf(Integer.parseInt(totalLabel.getText()) + 1000));
//			
//			count++;
//			countField.setText(String.valueOf(count));
//			
//			total += prices[2];
//			totalLabel.setText(String.valueOf(total));
//			
//			countArr[2]++;
//			eachLabel.setText("김밥 : " + countArr[0] + "개, 떡볶이 : " + countArr[1] + "개, 튀김모둠 : " + countArr[2] + "개");
//		});
	}

}
