package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		String[] find = {"홍길동", "김길동", "정길동"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String x : find) {
			map.put(x, 0); // 명단 초기화
		}
		
		for (String x : all) {
			map.put(x, map.get(x) + 1);
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
