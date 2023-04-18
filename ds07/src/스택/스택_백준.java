package 스택;

import java.util.Stack;

public class 스택_백준 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.empty());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.pop());
		stack.push(3);
		System.out.println(stack.empty());
		System.out.println(stack.peek());
	}

}
