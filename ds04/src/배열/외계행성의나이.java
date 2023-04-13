package 배열;

public class 외계행성의나이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Solution4 {
    public String solution(int age) {
        StringBuffer answer = new StringBuffer();
        
        while (age != 0) {
//            answer.append((char)((age % 10) + (int)'a'));
            answer.insert(0, (char)((age % 10) + (int)'a'));
            age /= 10;
        }
        
        return answer.toString();
    }
}