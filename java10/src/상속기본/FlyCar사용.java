package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyCar fly1 = new FlyCar("정열의 레드", true);
		FlyCar fly2 = new FlyCar("시원한 블루", false);
		
		fly1.fly();
		fly2.fly();
	}

}
