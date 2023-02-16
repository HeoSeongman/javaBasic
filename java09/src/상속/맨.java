package 상속;

public class 맨 extends 사람{
	
	protected int power;

	public 맨(String name, int age, int power) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.power = power;
	}

	@Override
	public void eat() {
		System.out.println("맨인 " + name + "이 또 먹고있네요.");
	}

	@Override
	public void sleep() {
		System.out.println("맨인 " + name + "이 또 자고있네요.");
	}
	
	
}
