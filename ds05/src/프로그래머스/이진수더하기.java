package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 이진수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin1 = "1111111111";
		String bin2 = "1111";
		Solution6 sol6 = new Solution6();
		System.out.println(sol6.solution(bin1, bin2));
	}

}

class Solution6 {
    public String solution(String bin1, String bin2) {
        StringBuffer answer = new StringBuffer();
//        int remained = 0, i = 0;
//        String srt = null, lng = null;
//        
//        if (bin1.length() < bin2.length()) {
//        	srt = bin1;
//        	lng = bin2;
//        } else {
//        	srt = bin2;
//        	lng = bin1;        	
//        }
//        
//        for (i = 1; i <= srt.length(); i++) {
//        	int sum = (bin1.charAt(bin1.length() - i) - '0') + (bin2.charAt(bin2.length() - i) - '0') + remained;
//        	answer.append(sum % 2);
//        	remained = sum / 2;
//        }
//        
//        for (; i <= lng.length(); i++) {
//        	int sum = (lng.charAt(lng.length() - i) - '0') + remained;
//        	answer.append(sum % 2);
//        	remained = sum / 2;
//        }
//        
//        if (remained == 1) {
//        	answer.append(remained);
//        }
        int remained = 0;
        
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(bin1, bin2));
        for (int i = 1; list.size() != 0; i++) {
        	int sum = remained;
        	for (String bin : list) {
        		sum += bin.charAt(bin.length() - i) - '0';
        	}
        	answer.append(sum % 2);
        	remained = sum / 2;
        	
        	for (int j = 0; j < list.size();) {
        		if (list.get(j).length() == i) {
        			list.remove(j);
        			continue;
        		}
        		j++;
			}
        }
        
        if (remained == 1) {
        	answer.append(remained);
        }
        
        return answer.reverse().toString();
    }
}