package 문제3;

public class Car {
	protected String name;
	protected String type;
	protected int price;
	
	public Car(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public void run() {
		System.out.println(name + "가 출발한다. 부아앙~ 꽤나 부드럽게 무리없이 달린다.");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
}
