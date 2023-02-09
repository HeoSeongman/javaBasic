package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[10];
		
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("====================================");
		
		char[] family = {'남', '여', '남', '남'};
		
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i]);
		}
		
		System.out.println("====================================");
		
		String[] fn = {"아빠", "엄마", "나다", "동생"};
		
		for (int i = 0; i < fn.length; i++) {
			System.out.println(fn[i]);
		}
		
		System.out.println("====================================");
		
		double[] eyes = {1.1, 0.5, 0.4, 1.1};
		
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		
		System.out.println("====================================");
		
		boolean[] launch = {true, true, false, false};
		
		for (int i = 0; i < launch.length; i++) {
			System.out.println(launch[i]);
		}
	}

}
