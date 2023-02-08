package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 숫자 누적
		int result1 = 0;
		
		for (int i = 0; i <= 300; i+=5) {
			result1 += i;
		}
		
//		for (int i = 1; i <= 300; i++) {
//			if (i%5==0) {
//				result1 += i;
//			}
//		}		
		System.out.println("5의 배수만 더하기 => " + result1);
		
		// 2. 문자 누적
		String result2 = "";
		
		for (int i = 0; i < 4; i++) {
			result2 += JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요.") + "랑 ";
		}
		
		System.out.println(result2);
	}

}
