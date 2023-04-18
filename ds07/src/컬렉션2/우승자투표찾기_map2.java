package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map2 {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String x : all) {
			// map 에 값이 없을 때 기본값 지정하여 put
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		System.out.println(map);
		
		int max = 0;
		String maxKey = null;
		for (String k : map.keySet()) {
			if (map.get(k) > max) {
				max = map.get(k);
				maxKey = k;
			}
		}
		
		System.out.println("최종 우승자는 총 " + max + "표를 받은 " + maxKey + "입니다.");
	}

}
