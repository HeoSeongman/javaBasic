package 인터페이스;

public class 애플잭 implements 아이폰잭 {

	@Override
	public void makeFlat() {
		System.out.println("흰색으로 납작하게 만든다.");
	}

	@Override
	public void makeTwo() {
		System.out.println("긴 줄을 사용하여 2센치로 만든다.");
	}
	
}
