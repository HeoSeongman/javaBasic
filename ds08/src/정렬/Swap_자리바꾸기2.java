package 정렬;

import java.util.Arrays;

public class Swap_자리바꾸기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"햄버거", "샌드위치", "커피", "초코칩쿠키"};
		print(str);
		swap(str, 0, 3);
		print(str);
		
	}
	
	public static void swap(String[] str, int a, int b) {
		String temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}
	
	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}
}
