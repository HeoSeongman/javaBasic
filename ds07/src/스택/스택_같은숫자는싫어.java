package 스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 스택_같은숫자는싫어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,3,3,0,1,1};
		Solution3 sol3 = new Solution3();
		System.out.println(Arrays.toString(sol3.solution(arr)));
	}

}

class Solution3 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        
        for (int num : arr) {
        	if (num != stack.peek()) {
        		stack.push(num);
        	}
        }
        
        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
        	answer[i] = stack.pop();
        }
        
        return answer;
    }
}