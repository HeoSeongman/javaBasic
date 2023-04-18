package 컬렉션2;

import java.util.ArrayList;

public class 구슬을나누는경우의수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balls = 30, share = 28;
		Solution5 sol5 = new Solution5();
		System.out.println(sol5.solution(balls, share));
	}

}

class Solution5 {
    public int solution(int balls, int share) {
        ArrayList<Integer> nlist = new ArrayList<Integer>();
        for (int i = 2; i <= balls; i++) {
        	nlist.add(i);
        }
        
        ArrayList<Integer> mlist = new ArrayList<Integer>();
        for (int i = 2; i <= share; i++) {
        	mlist.add(i);
        }
        
        ArrayList<Integer> nmlist = new ArrayList<Integer>();
        for (int i = 2; i <= balls - share; i++) {
        	nmlist.add(i);
        }
        
        
        
        return (int)(n / (m * nm));
    }
}