package 상속기본;

public class FlyCar extends Car {
	
	boolean fly;

	public FlyCar(String color, boolean fly) {
		super(color);
		// TODO Auto-generated constructor stub
		this.fly = fly;
	}
	
	public void fly() {
		if (fly) {
			System.out.println(color + "로 칠한 FlyCar가 날아오르기 시작합니다.");
		} else {
			System.out.println(color + "로 칠한 FlyCar가 멈춰 서 있습니다.");
		}
	}
}
