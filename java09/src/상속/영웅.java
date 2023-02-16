package 상속;

public class 영웅 extends 사람{

	public 영웅(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
//		super.eat();
		System.out.println("영웅인 " + name + "이 복스럽게 먹고있네요.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
//		super.sleep();
		System.out.println("영웅인 " + name + "이 코~자고있네요.");
	}
	
	
}
