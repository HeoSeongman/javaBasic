package 프로그래머스;

public class 각도기 {

	public static void main(String[] args) {
		int angle = 70;
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(angle));
	}

}

class Solution1 {
	public int solution(int angle) {
		if (angle < 90) {
			return 1;
		} else if (angle == 90) {
			return 2;
		} else if (angle < 180) {
			return 3;
		} else {
			return 4;
		}
	}
}
