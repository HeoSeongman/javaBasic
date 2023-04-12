package 프로그래머스;

import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "hi12392";
		Solution14 sol14 = new Solution14();
		System.out.println(Arrays.toString(sol14.solution(my_string)));
	}

}

class Solution14 {
    public int[] solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        
        for (char c : my_string.toCharArray()) {
        	if ((int)c >= '0' && (int)c <= '9') {
        		sb.append(c);
        	}
        }
        
        int[] answer = new int[sb.length()];
        String temp = sb.toString();
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = temp.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}