package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 a = new 반환값연습();
		System.out.println(a.add());
		
		double result2 = a.add(22.1, 10);
		System.out.println("더한 값은 : " + result2);
		
		String result3 = a.add("나는", "천재");
		System.out.println("더한 값은 : " + result3);
		
		String result4 = a.add(1, "번 천재");
		System.out.println("더한 값은 : " + result4);
		
		int[] result5 = a.add();
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date date = a.getDate();
		System.out.println(date);
		
		ArrayList list = a.getList();
		
	}

}
