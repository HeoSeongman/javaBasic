package 프로그래머스;

public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "zzz11a1";
		Solution4 sol4 = new Solution4();
		System.out.println(sol4.solution(my_string));
	}

}

class Solution4 {
    public int solution(String my_string) {
    	int temp = 0, answer = 0;
    	
    	for (int i = 0; i < my_string.length(); i++) {
    		if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
    			temp *= 10;
    			temp += ((int)my_string.charAt(i) - (int)'0');
    		} else {
    			answer += temp;
    			temp = 0;
    		}
    	}
    	
    	if (temp != 0) { // 끝에 숫자가 있을 경우 처리
    		answer += temp;
    	}
    	
        return answer;
    }
}