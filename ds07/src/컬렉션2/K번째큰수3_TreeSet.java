package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_TreeSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 개수를 입력 : ");
		int size = sc.nextInt();
		System.out.print("?번째 큰 수를 입력 : ");
		int k = sc.nextInt(); // 2번째로 큰 수
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "번 째 수 : ");
			num.add(sc.nextInt());
		}
		
		System.out.println(k + "번째 큰 수 : " + num.higher(num.size() - k));
		System.out.println(num);
		
	}

}
