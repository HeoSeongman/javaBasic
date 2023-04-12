package 프로그래머스;

public class 대문자와소문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "cccCCC";
		Solution13 sol13 = new Solution13();
		System.out.println(sol13.solution(my_string));
	}

}

class Solution13 {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        int d = (int)'A' - (int)'a'; // 대문자와 소문자 차이
        
        for (char c : my_string.toCharArray()) {
        	if (c >= (int)'a' && c <= (int)'z') { // 소문자일 때
        		answer.append((char)((int)c + d));
        	} else { 							  // 대문자일 때
        		answer.append((char)((int)c - d));
        	}
        }
        
        return answer.toString();
    }
}