package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random random = new Random();
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		
		int length = 6;
		for (int i = 0; i < length; i++) {
			if (!lotto.add(random.nextInt(45) + 1)) {
				i--;
			}
		}
		
		System.out.println(lotto.size());
		
		System.out.println(lotto.toString());
	}

}
