package 컬렉션2;

import java.util.Arrays;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		Solution4 sol4 = new Solution4();
		System.out.println(Arrays.toString(sol4.solution(my_str, n)));
	}

}

class Solution4 {
    public String[] solution(String my_str, int n) {
    	String[] answer = null;
    	if (my_str.length() % n == 0) {
    		answer = new String[my_str.length() / n];
    	} else {
    		answer = new String[my_str.length() / n + 1];    		
    	}
    	
    	for (int i = 0; i < my_str.length() / n; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = n * i; j < n * i + n; j++) {
				sb.append(my_str.charAt(j));
			}
			answer[i] = sb.toString();
		}
    	
    	if (my_str.length() % n != 0) {
    		StringBuffer sb = new StringBuffer();
    		for (int i = my_str.length() / n * n; i < my_str.length(); i++) {
    			sb.append(my_str.charAt(i));
    		}
    		answer[answer.length - 1] = sb.toString();
    	}
    	
        return answer;
    }
}