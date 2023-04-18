package 스택;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10};
		Solution1 sol1 = new Solution1();
		System.out.println(Arrays.toString(sol1.solution(arr)));
	}

}

class Solution1 {
    public int[] solution(int[] arr) {
    	if (arr.length == 1) {
    		return new int[]{-1};
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < arr.length; i++) {
    		list.add(arr[i]);
    	}
    	
        Arrays.sort(arr);
        list.remove(Integer.valueOf(arr[0]));
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}