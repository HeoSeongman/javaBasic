package 컬렉션2;

import java.util.*;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,3,3,0,1,1};
		Solution3 sol3 = new Solution3();
		System.out.println(Arrays.toString(sol3.solution(arr)));
	}

}


class Solution3 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int current = -1;
        
        for (int num : arr) {
        	if (num != current) {
        		list.add(num);
        		current = num;
        	}
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}