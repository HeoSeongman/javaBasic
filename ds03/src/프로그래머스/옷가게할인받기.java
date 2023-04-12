package 프로그래머스;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 150000;
		Solution7 sol7 = new Solution7();
		System.out.println(sol7.solution(price));
	}

}

class Solution7 {
    public int solution(int price) {
        double per = 0;
        if (price >= 500000) {
            per = 0.2;
        } else if (price >= 300000) {
            per = 0.1;
        } else if (price >= 100000) {
            per = 0.05;
        }
        return price -= price * per;
    }
}

