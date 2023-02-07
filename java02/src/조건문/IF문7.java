package 조건문;

import java.util.Date;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = JOptionPane.showInputDialog("열려라참깨! 암호를 대시오.");
		
		if (input1.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		String input2 = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는(자장면, 라면, 회)");
		
		if (input2.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if (input2.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (input2.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요.");
		}
		
		int input3 = Integer.parseInt(JOptionPane.showInputDialog("1번 정수를 입력하세요."));
		int input4 = Integer.parseInt(JOptionPane.showInputDialog("2번 정수를 입력하세요."));
		
		if (input3 > input4) {
			System.out.println(input3 + "이 더 큽니다.");
		} else if (input3 < input4) {
			System.out.println(input4 + "이 더 큽니다.");			
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		String no = "A100EX";
		
		switch(no.charAt(0)) {
		case 'A': System.out.println("기획부입니다");
			break;
		case 'B': System.out.println("총무부입니다");
			break;
		case 'C': System.out.println("개발부입니다");
			break;
		default: System.out.println("해당 부서 없음.");
		}
	}
}





//package 조건문;
//
//import java.util.Date;
//
//import javax.swing.JOptionPane;
//
//public class IF문7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input1 = JOptionPane.showInputDialog("열려라참깨! 암호를 대시오.");
//		
//		if (input1.equals("pass")) {
//			JOptionPane.showMessageDialog(null, "들어오세요");
//		} else {
//			JOptionPane.showMessageDialog(null, "나가세요");
//		}
//		
//		String input2 = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는(자장면, 라면, 회)");
//		
//		if (input2.equals("자장면")) {
//			JOptionPane.showMessageDialog(null, "중국집으로 가요.");
//		} else if (input2.equals("라면")) {
//			JOptionPane.showMessageDialog(null, "분식집으로 가요.");
//		} else if (input2.equals("회")) {
//			JOptionPane.showMessageDialog(null, "횟집으로 가요.");
//		} else {
//			JOptionPane.showMessageDialog(null, "그냥 안먹어요.");
//		}
//		
//		int input3 = Integer.parseInt(JOptionPane.showInputDialog("1번 정수를 입력하세요."));
//		int input4 = Integer.parseInt(JOptionPane.showInputDialog("2번 정수를 입력하세요."));
//		
//		if (input3 > input4) {
//			JOptionPane.showMessageDialog(null, input3 + "이 더 큽니다.");
//		} else {
//			JOptionPane.showMessageDialog(null, input4 + "이 더 큽니다.");
//		}
//		
//		String no = "A100EX";
//		
//		switch(no.charAt(0)) {
//		case 'A': 
//			JOptionPane.showMessageDialog(null, "기획부입니다.");
//			break;
//		case 'B': 
//			JOptionPane.showMessageDialog(null, "총무부입니다.");
//			break;
//		case 'C': 
//			JOptionPane.showMessageDialog(null, "개발부입니다.");
//			break;
//		default: 
//			JOptionPane.showMessageDialog(null, "해당 부서 없음");
//		}
//	}
//
//}
