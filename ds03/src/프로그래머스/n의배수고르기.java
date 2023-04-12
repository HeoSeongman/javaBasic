package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numlist = {2, 100, 120, 600, 12, 12};
		int n = 12;
		Solution15 sol15 = new Solution15();
		System.out.println(Arrays.toString(sol15.solution(n, numlist)));
	}

}

class Solution15 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}