package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 컬렉션정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(600);
		list.add(100);
		list.add(400);
		list.add(200);
		list.add(500);
		list.add(200);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(array));
		
		array[0] = 1000;
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list2.add(array[i]);
		}
		
		System.out.println(list2);
	}

}
