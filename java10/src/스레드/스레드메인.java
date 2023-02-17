package 스레드;

public class 스레드메인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		손님접속스레드 s1 = new 손님접속스레드();
		손님요청스레드 s2 = new 손님요청스레드();
		
		s1.start();
		s2.start();
	}

}
