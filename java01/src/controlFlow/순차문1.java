package controlFlow;

import javax.swing.JOptionPane;

public class 순차문1 {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		
		String result = "나의 이름은 " + name + "입니다.";
		
		System.out.println(result);
	}
}
