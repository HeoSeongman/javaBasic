package 문자열;

public class 중복된문자제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "We are the world";
		Solution9 sol9 = new Solution9();
		System.out.println(sol9.solution(my_string));
	}

}

class Solution9 {
    public String solution(String my_string) {
    	StringBuffer sb = new StringBuffer(my_string);
//    	int idx = 0;
//    	while (idx < sb.length()) {
//    		int rmidx = idx + 1;
//    		while (rmidx < sb.length()) {
//    			if (sb.charAt(idx) == sb.charAt(rmidx)) {
//    				sb.deleteCharAt(rmidx);
//    			} else {
//    				rmidx++;
//    			}
//    		}
//    		idx++;
//    	}
    	
    	for (int i = 0; i < sb.length(); i++) {
    		for (int rmi = i + 1; rmi < sb.length();) {
    			if (sb.charAt(i) == sb.charAt(rmi)) {
    				sb.deleteCharAt(rmi);
    			} else {
    				rmi++;
    			}
    		}
    	}
    	
        return sb.toString();
    }
}