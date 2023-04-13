package 문자열;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "Python";
		Solution7 sol7 = new Solution7();
		System.out.println(sol7.solution(my_string));
	}

}

class Solution7 {
    public String solution(String my_string) {
    	char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}