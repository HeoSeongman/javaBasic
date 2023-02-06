package controlFlow;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String str2 = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		String str3 = str2 + "에 저는 " + str1 + "를 합니다.";
		JOptionPane.showMessageDialog(null, str3);
		
//		System.out.println(str3);
	}

}
