package 상속;

public class 수퍼맨 extends 맨{
	
	protected boolean fly;

	public 수퍼맨(String name, int age, int power, boolean fly) {
		super(name, age, power);
		// TODO Auto-generated constructor stub
		this.fly = fly;
	}
	
	public void space() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("우주를 납니다. 우주미아인가요?");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	
	
}
