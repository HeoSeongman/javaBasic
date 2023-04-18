package 컬렉션2;

import java.util.HashMap;

public class 문자열내p와y의개수가동일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pPoooyY"; // true
		Solution1 sol1 = new Solution1();
		System.out.println(sol1.solution(s));
	}

}

class Solution1 {
    boolean solution(String s) {
    	s = s.toLowerCase();
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for (char c : s.toCharArray()) {
    		map.put(c, map.getOrDefault(c, 0) + 1);
    	}
    	
        return map.get('p') == map.get('y');
    }
}