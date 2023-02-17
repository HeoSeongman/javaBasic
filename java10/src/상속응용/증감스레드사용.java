package 상속응용;

public final class 증감스레드사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		증가스레드 increase = new 증가스레드();
		감소스레드 decrease = new 감소스레드();
		
		increase.start();
		decrease.start();
	}

}
