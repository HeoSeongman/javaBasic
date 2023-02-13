package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[990];
		int[] b = new int[990];
		
//		System.out.println(a.length);
//		System.out.println(b.length);
//		System.out.println(a);
//		System.out.println(b);
		
		Random random = new Random();
		for (int i = 0; i < b.length; i++) {
			a[i] = random.nextInt(4) + 1;
			b[i] = random.nextInt(4) + 1;
		}
		
		int score = 0;
		
		System.out.println("번호\t:\t답안\t<->\t내답");
		for (int i = 0; i < b.length; i++) {
			System.out.println(i + "\t:\t" + a[i] + "\t<->\t" + b[i]);
			if (a[i] == b[i]) {
				score++;
			}
		}
		
		System.out.println("토익점수는 " + score + "점입니다.");
	}

}
