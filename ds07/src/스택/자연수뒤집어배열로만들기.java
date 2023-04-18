package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 12345;
		Solution2 sol2 = new Solution2();
		System.out.println(Arrays.toString(sol2.solution(n)));
	}

}

class Solution2 {
    public int[] solution(long n) {
    	Stack<Integer> stack = new Stack<Integer>();
        
        while (n != 0) {
    		stack.push((int)(n % 10));
    		n /= 10;
    	}
        
        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
        	answer[i] = stack.pop();
        }
        
        
        return answer;
    }
}