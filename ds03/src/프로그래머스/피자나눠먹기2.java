package 프로그래머스;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 10;
		Solution6 sol6 = new Solution6();
		System.out.println(sol6.solution(n));
	}

}

class Solution6 {
    public int solution(int n) {
    	int temp = n;
        while (temp % 6 != 0) {
            temp += n;
        }
        return temp / 6;
    }
}