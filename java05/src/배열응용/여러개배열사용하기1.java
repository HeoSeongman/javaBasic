package 배열응용;

public class 여러개배열사용하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] family = {"아버지", "어머니", "나", "동생"};
		int[] age = {100, 50, 30, 18};
		double[] height = {175.5, 160.3, 173.0, 168.3};
		
		System.out.println("이름\t나이\t키");
		System.out.println("-------------------------");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);	
		}
	}

}
