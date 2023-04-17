package 프로그래머스;

import java.util.Arrays;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abdc";
		Solution5 sol5 = new Solution5();
		System.out.println(sol5.solution(s));
	}

}

class Solution5 {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        StringBuffer str = new StringBuffer(s);
        
        while (str.length() != 0) {
            char target = str.charAt(0); 
            int pre = str.length();
            for (int i = 0; i < str.length();) {
				if (target == str.charAt(i)) {
					str.deleteCharAt(i);
					continue;
				}
				i++;
			}
            if (pre - str.length() == 1) {
                answer.append(target);
            }
        }
        
        char[] sorting = answer.toString().toCharArray();
        Arrays.sort(sorting);
        
        return new String(sorting);
    }
}