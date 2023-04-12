package 프로그래머스;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rsp = "205";
		Solution12 sol12 = new Solution12();
		System.out.println(sol12.solution(rsp));
	}

}

class Solution12 {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        
        for (char c : rsp.toCharArray()) {
        	switch (c) {
        	case '0' : answer.append('5'); break;
        	case '2' : answer.append('0'); break;
        	case '5' : answer.append('2'); break;
        	}
        }
        
        return answer.toString();
    }
}