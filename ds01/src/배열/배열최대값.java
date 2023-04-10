package 배열;

import java.util.Random;

public class 배열최대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] nums = new int[1000];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(1000);
		}
		
		int max = nums[0];
		for (int n : nums) {
			if (n > max) {
				max = n;
			}
		}
		
		System.out.println("max : "+ max);
	}

}
