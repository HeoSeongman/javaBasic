package 프로그래머스;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Solution9 {
    public String solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
        
//        for (int i = 0; i < my_string.length(); i++) {
//        	for (int j = 0; j < n; j++) {
//        		answer.append(my_string.charAt(i));
//        	}
//        }
        
        for (char c : my_string.toCharArray()) {
        	for (int j = 0; j < n; j++) {
        		answer.append(c);
        	}
        }
        
        return answer.toString();
    }
}