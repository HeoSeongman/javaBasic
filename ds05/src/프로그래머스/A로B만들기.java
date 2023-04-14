package 프로그래머스;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String before = "ao", after = "oa";
		Solution2 sol2 = new Solution2();
		System.out.println(sol2.solution(before, after));
	}

}

class Solution2 {
    public int solution(String before, String after) {
    	int answer = 1;
        char[] bchars = before.toCharArray();
        char[] achars = after.toCharArray();
        Arrays.sort(bchars);
        Arrays.sort(achars);
        
        for (int i = 0; i < achars.length; i++) {
			if (achars[i] != bchars[i]) {
				answer = 0;
				break;
			}
		}
        
        return answer;
    }
}