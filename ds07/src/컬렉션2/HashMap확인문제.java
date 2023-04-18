package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"apple", "banana", "apple", "banana", "melon", "apple"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String key : fruits) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int max = 0;
		String maxKey = null;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				maxKey = key;
			}
		}
		
		System.out.println("최다 득표한 과일은 " + max + "표로, " + maxKey + "입니다.");
		System.out.println(map);
	}

}
