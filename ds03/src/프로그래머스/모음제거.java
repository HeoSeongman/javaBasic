package 프로그래머스;

public class 모음제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "nice to meet you";
		Solution10 sol10 = new Solution10();
		System.out.println(sol10.solution(input));
	}

}

class Solution10 {
    public String solution(String my_string) {
        String[] mo = {"a", "e", "i", "o", "u"};
        
        for (String c : mo) {
        	System.out.println(c);
            my_string = my_string.replace(c, "");
        }
        
        System.out.println(my_string);
        return my_string;
    }
}