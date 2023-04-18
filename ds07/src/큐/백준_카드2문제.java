package 큐;

import java.util.LinkedList;

public class 백준_카드2문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		LinkedList<Integer> qu = new LinkedList<Integer>();
		for (int i = 1; i <= x; i++) {
			qu.add(i);
		}
		System.out.println(qu);
		for (int i = 0; i<= qu.size(); i++) {
			qu.remove();
			System.out.println("remove >> " + qu);
			qu.add(qu.remove());
			System.out.println("add >> " + qu);
		}
		qu.remove();
		System.out.println("qu에 남은 것 >> " + qu);
	}

}
