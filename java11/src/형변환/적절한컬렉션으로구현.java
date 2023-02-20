package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class 적절한컬렉션으로구현 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("디자이너");
		set.add("프로그래머");
		set.add("DB관리자");
		
		System.out.println(set.toString());
		
		Queue<String> qu = new LinkedList<String>();
		qu.add("상한우유");
		qu.add("싱싱우유");
		
		System.out.println(qu.toString());
		
		List<String> list = new ArrayList<String>();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		list.remove("송스키");
		
		System.out.println(list.toString());
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "엄마");
		map.put(2, "아빠");
		map.put(3, "친구");
		map.put(4, "동생");
		
		System.out.println(map.get(2));
	}

}
