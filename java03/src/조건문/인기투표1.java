package 조건문;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yes = 0, no = 0;
		
		for (int i = 0; i < 10; i++) {
			int input = Integer.parseInt(JOptionPane.showInputDialog("배가 고픈가요? (고프면 1, 고프지 않으면 2)"));
			
			switch(input) {
			case 1: 
				yes++;
				break;
			case 2: 
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1가 2 중 선택하세요.");
				i--;
			}
		}
		
		System.out.println("배고픈 사람은 " + yes + "명.");
		System.out.println("배고프지 않은 사람은 " + no + "명.");
	}

}
