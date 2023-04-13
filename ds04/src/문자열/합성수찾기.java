package 문자열;

public class 합성수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 sol8 = new Solution8();
		int n = 15;
		System.out.println(sol8.solution(n));
	}

}

class Solution8 {
    public int solution(int n) {
        int answer = 0;
        
        int[] sosu = {2,3,5,7};
        for (int i = 2; i <= n; i++) {
            int count = 0, temp = i;
            
            for (int j = 2; j <= i; j++) {
                for (int snum : sosu) {
                	if (temp % snum == 0) {
                		count++;
                		temp /= snum;
                	}
                }
                
                if (temp == 0) {
                	break;
                }
            }
            
        }
        
        return answer;
    }
}