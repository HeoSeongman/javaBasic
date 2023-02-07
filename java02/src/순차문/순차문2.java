package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = JOptionPane.showInputDialog("정수를 입력하세요.");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요.");
				
		int data11 = Integer.parseInt(data1);		
		int data22 = Integer.parseInt(data2);
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		
		System.out.println("int => " + result);
		System.out.println("double => " + result2);
		
	}

}
