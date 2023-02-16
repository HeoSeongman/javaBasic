package 상속;

public class 우먼 extends 사람{
	
	protected int power;

	public 우먼(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("우먼이 식사를 합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("우먼 잠을 자고있습니다.");
	}

	@Override
	public String toString() {
		return "우먼 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}

}
