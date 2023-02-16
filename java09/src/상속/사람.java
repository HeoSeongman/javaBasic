package 상속;

public class 사람 {
	protected String name;
	protected int age;
	
	public 사람(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + "이 뭘 먹고있네요.");
	}
	
	public void sleep() {
		System.out.println(name + "이 드르렁 코를 골며 자고있네요.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
}
