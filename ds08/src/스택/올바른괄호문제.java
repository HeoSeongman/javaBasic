package 스택;

import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "()()";
		String s = "(()(";
		Solution1 sol1 = new Solution1();
		System.out.println(sol1.solution(s));
	}

}

class Solution1 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
        	if (c == '(') {
        		stack.push(c);
        	} else {
        		if (stack.empty()) {
        			return false;
        		}
        		stack.pop();
        	}
        }

        return stack.empty();
    }
}