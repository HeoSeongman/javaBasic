package 문자열;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "I love you";
		Solution2 sol2 = new Solution2();
		System.out.println(sol2.solution(my_string, 3, 6));
	}

}

class Solution2 {
    public String solution(String my_string, int num1, int num2) {
        char temp = my_string.charAt(num1);
        StringBuffer sb = new StringBuffer(my_string);
        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, temp);
        return sb.toString();
    }
}