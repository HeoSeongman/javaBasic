package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		System.out.println(list);
		
		// 중간에 삽입
		list.add(0, "김길동");
		System.out.println(list);
		
		// 제거
		list.remove(0);
		System.out.println(list);

		// 변경
		list.set(0, "정길동");
		System.out.println(list);

		// 인덱스 위치 확인
		int index = list.indexOf(true);
		System.out.println(index);
		
		// 포함 여부 확인
		boolean contains = list.contains("김길동");
		System.out.println(contains);
	}
}
