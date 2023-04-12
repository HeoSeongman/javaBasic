package 프로그래머스;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println((int)'0');
//		System.out.println((int)'9');
		String my_string = "1a2b3c4d123";
		Solution11 sol11 = new Solution11();
		System.out.println(sol11.solution(my_string));
		
		System.out.println(Math.sqrt(976));
	}

}

class Solution11 {
    public int solution(String my_string) {
        int answer = 0;
        
//        for (int i = 0; i < my_string.length(); i++) {
//        	if ((int)my_string.charAt(i) >= (int)'0' && (int)my_string.charAt(i) <= (int)'9') {
//        		answer += (int)my_string.charAt(i) - (int)'0';
//        	}
//        }
        
        for (char c : my_string.toCharArray()) {
        	if ((int)c >= (int)'0' && (int)c <= (int)'9') {
        		answer += (int)c - (int)'0';
        	}
        }
        
        return answer;
    }
}