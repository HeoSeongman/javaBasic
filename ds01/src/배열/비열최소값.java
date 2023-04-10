package 배열;

public class 비열최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 90, 70, 20, 50, 60 };
		int min = numbers[0];
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] < min) {
//				min = numbers[i];
//			}
//		}
		
		for (int n : numbers) {
			if (n < min) {
				min = n;
			}
		}
		
		System.out.println("min : " + min);
	}

}
