package 배열;

public class 이중for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " : ");
			for (int j = 1; j <= 10; j++) {
//				System.out.print(j);
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}

}
