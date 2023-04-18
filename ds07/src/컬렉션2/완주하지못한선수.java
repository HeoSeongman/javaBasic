package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		Solution2 sol2 = new Solution2();
		System.out.println(sol2.solution(participant, completion));
	}

}

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String key : participant) {
        	map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for (String key : completion) {
        	map.put(key, map.get(key) - 1);
        }

        String answer = null;
        for (String key : map.keySet()) {
        	if (map.get(key) > 0) {
        		answer = key;
        	}
        }
        
        return answer;
    }
}