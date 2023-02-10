package 복습;

import java.util.Iterator;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"일이름", "이이름", "삼이름", "사이름", "오이름"};
		
		String[] unk = new String[10];
		
		System.out.println(names);
		
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[2]);
		
		System.out.println("===================================");
		
		String[] location = {"국내", "일본", "대만", "베트남", "미국"};
		char[] color = {'빨', '주', '노', '초', '보'};
		double[] height = {155.5, 166.6, 177.7, 188.8, 199.9};
		
		for (String x : location) {
			System.out.println(x);
		}
		
		System.out.println("===================================");
		
		for (char x : color) {
			System.out.println(x);
		}
		
		System.out.println("===================================");
		
		for (double x : height) {
			System.out.println(x);
		}
	}

}
