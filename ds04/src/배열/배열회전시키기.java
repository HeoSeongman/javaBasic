package 배열;

import java.util.Arrays;

public class 배열회전시키기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3};
		Solution3 sol3 = new Solution3();
		System.out.println(Arrays.toString(sol3.solution(numbers, "right")));
	}

}

class Solution3 {
    public int[] solution(int[] numbers, String direction) {
    	int dir = 0, i = 0, temp = 0;
    	if (direction.equals("left")) {
    		dir = 1; // 진행방향
    		i = 1; // 시작 인덱스
    	} else {
    		dir = -1;
    		i = numbers.length - 2;
    	}
    	temp = numbers[i - dir];
    	
    	for (int count = numbers.length - 1; count > 0; count--, i += dir) {
			numbers[i - dir] = numbers[i];
			System.out.println(i);
		}
    	numbers[i - dir] = temp;
    	
        return numbers;
    }
}