package 큐;

import java.util.LinkedList;
import java.util.Queue;

public class 큐_백준 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> qu = new LinkedList<Integer>();
		qu.push(1);
		qu.push(2);
		System.out.println(qu.peek());
		System.out.println(qu.get(qu.size() - 1));
		System.out.println(qu.size());
		System.out.println(qu.isEmpty());
		try {
			qu.pop();
			qu.pop();
			qu.pop();
		} catch (Exception e) {
			System.out.println(-1);
		}
		System.out.println(qu.size());
		System.out.println(qu.isEmpty());
		try {
			qu.pop();
		} catch (Exception e) {
			System.out.println(-1);
		}
		qu.push(3);
		System.out.println(qu.isEmpty());
		System.out.println(qu.peek());
	}

}
