package 배열;

import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
		Solution1 sol1 = new Solution1();
		System.out.println(Arrays.toString(sol1.solution(numbers)));
	}
	
}

class Solution1 {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) { // 양수일 떄
                numbers[i] *= 2;
            } else { // 음수일 때
                numbers[i] = numbers[i] * -1 * 2 * -1;
            }
        }
        
        return numbers;
    }
}