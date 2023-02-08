package 복습;

import javax.swing.JOptionPane;

public class 순차문간단하게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("1번 정수를 입력하세요."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("2번 정수를 입력하세요."));
		
		System.out.println("두 정수의 합 => " + (num1 + num2));
		JOptionPane.showMessageDialog(null, "두 정수의 합은 " + (num1 + num2) + "입니다.");
	}

}
