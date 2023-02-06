package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String str2 = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정이신가요?");
		
		String str3 = "오늘 " + str1 + "에 수업 후 나는 " + str2 + "할 예정";
		
		System.out.println(str3);
	}

}
