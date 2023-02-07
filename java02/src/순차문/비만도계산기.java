package 순차문;

import javax.swing.JOptionPane;

public class 비만도계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요."));
		double height = Double.parseDouble(JOptionPane.showInputDialog("신장를 입력하세요."));
		height /= 100;
		
		double bmi = weight / (height * height);
		
		System.out.println("비만도는 " + bmi + "입니다.");
		
	}

}
