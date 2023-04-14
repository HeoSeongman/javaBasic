package 프로그래머스;

import java.util.Arrays;

public class 진료순서정하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emergency = {30, 10, 23, 6, 100};
		Solution3 sol3 = new Solution3();
		System.out.println(Arrays.toString(sol3.solution(emergency)));
	}

}

class Solution3 {
    public int[] solution(int[] emergency) {
    	int[] sorted = emergency.clone();
    	Arrays.sort(sorted);
        int[] answer = new int[emergency.length];
        
        System.out.println(Arrays.toString(emergency));
        System.out.println(Arrays.toString(sorted));
        
        for (int i = 0; i < answer.length; i++) {
        	for (int j = 0; j < sorted.length; j++) {
        		if (emergency[i] == sorted[j]) {
        			answer[i] = sorted.length - j;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}