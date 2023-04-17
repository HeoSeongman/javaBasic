package 프로그래머스;

public class 컨트롤제트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10 20 30 40";
		Solution7 sol7 = new Solution7();
		System.out.println(sol7.solution(s));
	}

}

class Solution7 {
    public int solution(String s) {
        int answer = 0;
        
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
        	if (strings[i].equals("Z")) {
        		answer -= Integer.parseInt(strings[i - 1]);
        		continue;
        	}
        	answer += Integer.parseInt(strings[i]);
        }
        
        return answer;
    }
}