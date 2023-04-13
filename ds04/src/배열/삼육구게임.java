package 배열;

public class 삼육구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 sol5 = new Solution5();
		System.out.println(sol5.solution(29423));
	}

}

class Solution5 {
    public int solution(int order) {
        int answer = 0;
        
        while (order != 0) {
            if (order % 10 % 3 == 0) {
                answer++;
            }
            order /= 10;
        }
        
        return answer;
    }
}