package 형변환;

import java.util.LinkedList;
import java.util.Queue;

public class Queue확인문제 {

	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<String>();
		qu.add("국어");
		qu.add("수학");
		qu.add("영어");
		qu.add("컴퓨터");
		
		System.out.println("전체 시험 볼 과목 : " + qu.toString());
		qu.remove();
//		System.out.println("1일차 시험 본 후 남은 과목 : " + qu.toString());
//		qu.remove();
//		System.out.println("2일차 시험 본 후 남은 과목 : " + qu.toString());
//		qu.remove();
//		System.out.println("3일차 시험 본 후 남은 과목 : " + qu.toString());
//		qu.remove();
		for (int i = qu.size(), day = 1; i > 0; i--, day++) {
			System.out.println(day + "일차 시험 본 후 남은 과목 : " + qu.toString());
			qu.remove();
		}
	}

}
