package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] foods = {"감자", "고구마", "우유", "감자", "양파"};
		printArr(foods);
		
		List<String> list = Arrays.asList(foods);
		//1.
		list.lastIndexOf("감자");
		System.out.println(list.toString());
		//2.
		if (list.contains("양파")) {
			System.out.println("양파는 안 사도 된다.");
		} else {
			System.out.println("양파를 사서 냉장고에 넣어야 한다.");			
		}
		//3.
		list.set(list.indexOf("우유"), "춘식이우유");
		System.out.println(list.toString());
		//4.
		list.set(list.indexOf("양파"), "양파즙");
		System.out.println(list.toString());
		//5.
		ArrayList<String> foods2 = new ArrayList<String>(list);
		System.out.println(foods2.toString());
		
		printArr(foods);
	}
	
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void printArr(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
