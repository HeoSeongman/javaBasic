package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		// 1. 가고 싶은 여행지를 중복 없이 컬렉션으로 만들어서 전체 출력
		Set<String> trav = new HashSet<String>();
		trav.add("일본");
		trav.add("미국");
		trav.add("베트남");
		trav.add("칠레");
		trav.add("아이슬란드");
		
		System.out.println("1. 가고 싶은 여행자 5곳 : " + trav + '\n');
		
		// 2.
		Map<String, String> home = new HashMap<String, String>();
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		
		System.out.println("2.\n각 방의 물건 전체 출력 : " + home);
		System.out.println("현관에는 무엇이 있나요? : " + home.get("현관"));
		home.replace("거실", "책상");
		System.out.println("거실에 책상으로 변경하여 전체 출력 : " + home + "\n");
		
		// 3.
		List<String> todoList = new ArrayList<String>();
		todoList.add("코딩 공부");
		todoList.add("빨래");
		todoList.add("설거지");
		todoList.add("물건 정리");
		todoList.add("생각 정리");
		
		System.out.println("3.\n오늘 내가 할 일 전체 출력 : " + todoList);
		System.out.println("첫 번째 할 일 : " + todoList.get(0));
		System.out.println("마지막 할 일 : " + todoList.get(todoList.size() - 1));
		todoList.set(1, "청소");
		System.out.println("2번째 할 일을 변경 후 전체 출력 " + todoList);
	}

}
