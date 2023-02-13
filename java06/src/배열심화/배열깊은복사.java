package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = { 100, 200, 300 };
//		int[] num2 = num1;
		int[] num2 = num1.clone();

		System.out.println(num1);
		System.out.println(num2);

		num1[0] = 999;
		
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}

}
