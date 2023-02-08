package 조건문;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu = 0, jeans = 0, bts = 0;
		String[] choice = {"아이유", "뉴진스", "BTS"};
		
		for (int i = 0; i < 10; i++) {
			int input = JOptionPane.showOptionDialog(null, "인기투표 : 1) 아이유, 2) 뉴진스, 3) BTS", "투표 부탁드려요.", 0, 1, null, choice, choice[0]);
			
			switch(input) {
			case 0:
				iu++;
				break;
			case 1:
				jeans++;
				break;
			case 2:
				bts++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "아이유, 뉴진스, BTS 중 선택하세요.");
				i--;
			}
			
		}
		
//		for (int i = 0; i < 10; i++) {
//			String input = JOptionPane.showInputDialog("인기투표 : 1) 아이유, 2) 뉴진스, 3) BTS");
//			
//			switch(input) {
//			case "아이유": 
//				iu++;
//				break;
//			case "뉴진스": 
//				jeans++;
//				break;
//			case "BTS":
//				bts++;
//				break;
//			default:
//				JOptionPane.showMessageDialog(null, "아이유, 뉴진스, BTS 중 선택하세요.");
//				i--;
//			}
//		}
		
		JOptionPane.showMessageDialog(null, "인기 투표 결과입니다.\n\n" 
				+ "아이유는 " + iu + "명이 좋아합니다.\n"
				+ "뉴진스는 " + jeans + "명이 좋아합니다.\n"
				+ "BTS는 " + bts + "명이 좋아합니다.");
		
//		System.out.println("아이유는 " + iu + "명이 좋아합니다.");
//		System.out.println("뉴진스는 " + jeans + "명이 좋아합니다.");
//		System.out.println("BTS는 " + bts + "명이 좋아합니다.");
	}

}
