package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3, 4, 5, 1, 2};
		int k = 2; // 2번째로 큰 수
		Arrays.sort(num);
		System.out.println(k + "번째 큰 수 : " + num[num.length - k]);
		System.out.println(Arrays.toString(num));
		
		System.out.print("[");
		for (int i = 0; i < num.length - 1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.println(num[num.length - 1] + "]");
	}

}
