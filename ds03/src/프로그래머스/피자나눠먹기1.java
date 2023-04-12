package 프로그래머스;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 15;
		Solution4 sol4 = new Solution4();
		System.out.println(sol4.solution(n));
	}

}

class Solution4 {
    public int solution(int n) {
        int answer = n / 7;
//        if (n % 7 != 0) {
//            answer++;
//        }
//        return answer;
        return n % 7 != 0 ? ++answer : answer;
    }
}