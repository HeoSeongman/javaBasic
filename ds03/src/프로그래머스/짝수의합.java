package 프로그래머스;

public class 짝수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

class Solution2 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i += 2) {
			answer += i;
		}
		return answer;
	}
}