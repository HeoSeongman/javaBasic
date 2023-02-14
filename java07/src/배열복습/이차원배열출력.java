package 배열복습;

public class 이차원배열출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6, 7 },
				{ 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 }
		};
		
//		System.out.println(arr1.length);
//		System.out.println(arr1[0][0]);
//		System.out.println(arr1[1][2]);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
//		int[][] arr2 = new int[2][];
	}

}
