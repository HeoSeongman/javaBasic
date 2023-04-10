package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		int[] ages = {60, 50, 30, 20, 10};
		
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 55.5;
		weight[2] = 88.8;
		weight[3] = 64.2;
		weight[4] = 67.8;
		
		for (int i = 0; i < weight.length; i++) {
			System.out.println(ages[i] + " " + weight[i]);
		}
		
		for (int age : ages) {
			System.out.println(age);
		}
		
		for (double w : weight) {
			System.out.println(w);
		}
		
		
	}

}
