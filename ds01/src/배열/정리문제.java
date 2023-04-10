package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		//1.
//		Scanner sc = new Scanner(System.in);
//		
//		int[] num1 = new int[5];
//		for (int i = 0; i < num1.length; i++) {
//			num1[i] = sc.nextInt();
//		}
//		
//		int min = num1[0];
//		for (int n1 : num1) {
//			if (n1 < min) {
//				min = n1;
//			}
//		}
//		sc.close();
		
		//2.
		Random r = new Random();
		int[] num2 = new int[20];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = r.nextInt(900);
		}
		
		int max = num2[0];
		for (int n2 : num2) {
			if (n2 > max) {
				max = n2;
			}
		}
		
		//3.
		String s1 = "참좋다", s2 = "진짜좋다";
		System.out.println("두 문자열이 일치하는지? : " + s1.equals(s2));
		
		//4.
		String s3 = "나는 진짜 java programmer가되었어";
		System.out.println(s3.substring(6, 21).toUpperCase());
		
		//5.
		String s4 = "2056521";
		if (s4.charAt(0) == '1') {
			System.out.println("남자네요.");
		} else {
			System.out.println("여자네요.");			
		}
		
		//6.
		String s5 = "[ 10, 20, 30, 40, 50]";
		String[] split = s5.replace("[", "").replace("]", "").trim().split(", ");
		int sum = 0;
		for (String s : split) {
			sum += Integer.parseInt(s);
		}
		System.out.println("s5를 합한 값: " + sum);
		
		//7.
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(split[i]);
		}
		Arrays.sort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
