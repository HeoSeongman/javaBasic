package 배열복습;

public class 이차원배열출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str = {
				{"낙동강종주", "북한강종주", "한강종주", "아라뱃길종주"},
				{"강원도종주", "동해안종주", "오천종주", "금강종주"},
				{"영산강종주", "섬진강종주", "새재종주", "울릉도종주"}
		};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
