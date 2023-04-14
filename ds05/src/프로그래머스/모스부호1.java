package 프로그래머스;

public class 모스부호1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letter = ".--. -.-- - .... --- -.";
		Solution1 sol1 = new Solution1();
		System.out.println(sol1.solution(letter));
	}

}

class Solution1 {
    public String solution(String letter) {
    	String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	StringBuffer sb = new StringBuffer();
    	for (String s : letter.split(" ")) {
    		for (int i = 0; i < morse.length; i++) {
    			if (s.equals(morse[i])) {
    				sb.append((char)(i + 'a'));
    				break;
    			}
    		}
    	}
    	return sb.toString();
    }
}