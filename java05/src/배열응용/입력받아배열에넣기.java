package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] location1 = new String[3];
		String[] location2 = new String[3];
		
		System.out.println("작년에 가고 싶었던 곳 중 세 곳을 입력받아 넣으세요.");
		for (int i = 0; i < 3; i++) {
			location1[i] = scan.next();
		}
		
		System.out.println("올해에 가고 싶었던 곳 중 세 곳을 입력받아 넣으세요.");
		for (int i = 0; i < 3; i++) {
			location2[i] = scan.next();
		}
		
		int same = 0;
		for (int i = 0; i < 3; i++) {
			if (location1[i].equals(location2[i])) {
				same++;
			}
		}
		
		System.out.println("작년과 올해가 같은 곳은 총 " + same + "곳 입니다.");
		
		scan.close();
	}

}
