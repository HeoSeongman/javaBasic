package 프로그래머스;

public class 문자열계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "3 + 4 - 231";
		Solution9 sol9 = new Solution9();
		System.out.println(sol9.solution(my_string));
	}

}

class Solution9 {
    public int solution(String my_string) {
        int answer = 0, num = 0, flag = 1;
        my_string = my_string.replace(" ", "");
        
        for (int i = 0; i < my_string.length(); i++) {
        	if (my_string.charAt(i) == '+') {
        		answer += num * flag;
        		flag = 1;
        		num = 0;
        	} else if (my_string.charAt(i) == '-') {
        		answer += num * flag;
        		flag = -1;
        		num = 0;
        	} else {
        		num *= 10;
        		num += (my_string.charAt(i) - '0');
        	}
        }
        
        return answer + (num * flag);
    }
}