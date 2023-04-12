package 프로그래머스;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 64, k = 6;
		Solution3 sol3 = new Solution3();
		System.out.println(sol3.solution(n, k));
	}

}

class Solution3 {
    public int solution(int n, int k) {
        return (n * 12000) + ((k - (n / 10)) * 2000);
    }
}