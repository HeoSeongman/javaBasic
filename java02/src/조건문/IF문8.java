package 조건문;

import java.util.Date;

import javax.swing.JOptionPane;

public class IF문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("1번 정수를 입력하세요."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("2번 정수를 입력하세요."));
		char oper = JOptionPane.showInputDialog("사칙연산자 하나를 입력하세요.").charAt(0);
		int result1 = 0;
		
		switch(oper) {
		case '+': result1 = num1 + num2;
			break;
		case '-': result1 = num1 - num2;
			break;
		case '*': result1 = num1 * num2;
			break;
		case '/': result1 = num1 / num2;
			break;
		}
		
		System.out.println("두 수를 처리한 결과 => " + result1);
		
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("1번 정수를 입력하세요."));
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("2번 정수를 입력하세요."));
		
		double result2 = (double)num3 / (double)num4;
		System.out.printf("두 수를 나눈 결과 => %.2f", result2);
	}

}
