package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		printArr(s2);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
		
		//1.
		System.out.println(list.contains("aaa"));
		//2.
		list.add("fff");
		System.out.println(list);
		//3.
		list.add(3, "ggg");
		System.out.println(list);
		//4.
		list.remove("ccc");
		System.out.println(list);
		//5.
		String[] s3 = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			s3[i] = list.get(i);
		}
		System.out.println(list);
	}
	
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void printArr(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
