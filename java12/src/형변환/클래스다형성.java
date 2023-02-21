package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 클래스다형성 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add(123);
		list.add(13.45);
		list.add(new JButton("버튼111"));
		
		String name = (String)list.get(0);
		int num = (Integer)list.get(1);
		double dob = (Double)list.get(2);
		JButton btn = (JButton)list.get(3);
	}

}
