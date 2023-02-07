package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = JOptionPane.showInputDialog("당신의 취미는?");
		String data2 = JOptionPane.showInputDialog("언제하시나요?");
		String data3 = "나의 취미는 " + data1 + "이고, " + data2 + "때 합니다.";
		
		System.out.println(data3);
	}

}
