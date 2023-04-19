package 정렬;

import java.util.Arrays;

public class Swap_자리바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {6, 1, 2, 3, 5, 9};
		print(num);
		swap(num, 0, 5);
		print(num);
		
	}
	
	public static void swap(int[] num, int a, int b) {
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
}
