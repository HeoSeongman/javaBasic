package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {12, 1, 9, 33, 123, 57, 76, 34, 986};
		Arrays.sort(s);
		printArr(s);
		
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		printArr(s2);
		
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		
//		list.remove("bbb");
		System.out.println(list.indexOf("ccc"));
		System.out.println(list.lastIndexOf("aaa"));
		System.out.println(list.toString());
//		list.add(0, "ddd");
//		list.add("fff");
		list.set(2, "ggg");
		System.out.println(list.toString());
		
		ArrayList<String> list2 = new ArrayList<String>(list);
		System.out.println(list2.toString());
	}
	
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void printArr(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
