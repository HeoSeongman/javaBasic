package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 컬렉션들 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("asdf");
		list.add(123);
		list.add(11.22);
		list.add(new JButton());
		
		String name = (String)list.get(0);
		int age = (Integer)list.get(1);
	}

}
