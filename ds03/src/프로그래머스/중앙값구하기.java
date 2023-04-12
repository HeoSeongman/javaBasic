package 프로그래머스;

import java.util.Arrays;

public class 중앙값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 sol8 = new Solution8();
		int[] array = {7, 2, 1, 11, 10};
		System.out.println(sol8.solution(array));
		System.out.println(Arrays.toString(array));
		
		int n = 23;
		int[] answer = n % 2 == 0 ? new int[n / 2] : new int[n / 2 + 1];
		
		for (int i = 0, j = 1; i < answer.length; i++, j += 2) answer[i] = j;
	}

}

class Solution8 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}