package 상속;

public class 원더우먼 extends 우먼{

	protected boolean fly;
	
	public 원더우먼(String name, int age, int power, boolean fly) {
		super(name, age, power);
		this.fly = fly;
	}

	@Override
	public void eat() {
		System.out.println("원더우먼이 식사를 합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("원더우면이 잠을 자고있습니다.");
	}
	
	public void space() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("원더우먼이 우주에서 지켜보고 있습니다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
