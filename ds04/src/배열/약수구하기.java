package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		Solution6 sol6 = new Solution6();
		System.out.println(Arrays.toString(sol6.solution(n)));
	}

}

class Solution6 {
	public int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}