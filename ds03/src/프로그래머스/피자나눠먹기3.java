package 프로그래머스;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		int n = 12, slice = 4;
		Solution5 sol5 = new Solution5();
		System.out.println(sol5.solution(slice, n));
	}

}

class Solution5 {
    public int solution(int slice, int n) {
        int answer = n / slice;
//        if (n % 7 != 0) {
//            answer++;
//        }
//        return answer;
        return n % slice != 0 ? ++answer : answer;
    }
}