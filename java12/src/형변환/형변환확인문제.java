package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		me.add(1000); // 돈
		me.add(189.1); // 키
		me.add(false); // 아침 여부
		me.add('남'); // 성별
		
		System.out.println("1. 전체 목록을 출력");
		System.out.println("돈 : " + me.get(0));
		System.out.println("키 : " + me.get(0));
		System.out.println("아침 식사 여부 : " + me.get(0));
		System.out.println("성별 : " + me.get(0));
		System.out.println();
		
		int cash = (int)me.get(0) + 2000;
		System.out.println("2. 돈 1000을 꺼내서 2000을 더해 출력 : " + cash);
		
		double height = (double)me.get(1) + 10;
		System.out.println("3. 키 189.1을 꺼내서 10을 더해 출력 : " + height);
		
		if ((boolean)me.get(2)) {
			System.out.println("4. 배불러요.");
		} else {
			System.out.println("4. 배고파요.");			
		}
		
		if ((char)me.get(3) == '남') {
			System.out.println("5. 주민번호는 1, 3이에요.");
		} else {
			System.out.println("5. 주민번호는 2, 4이에요.");			
		}
	}

}
