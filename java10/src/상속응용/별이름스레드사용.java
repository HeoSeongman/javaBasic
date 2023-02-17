package 상속응용;

public class 별이름스레드사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		증가스레드 increase = new 증가스레드();
		감소스레드 decrease = new 감소스레드();
		별스레드 star = new 별스레드();
		이름스레드 name = new 이름스레드();
		
		increase.start();
		decrease.start();		
		star.run();
		name.run();
	}

}
