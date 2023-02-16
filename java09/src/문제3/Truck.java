package 문제3;

public class Truck extends Car {

	protected int payloadWeight; // 현재 적재량
	protected String payloadType; // 적재품 유형
	
	public Truck(String name, String type, int price, int payloadWeight, String payloadType) {
		super(name, type, price);
		this.payloadWeight = payloadWeight;
		this.payloadType = payloadType;
	}
	
	@Override
	public void run() {
		System.out.println(name + "가 출발한다. 1단 집어넣고 클러치를 떼며 출발하려는데~!!! 아뿔싸, 너무 빨리 뗀 나머지 시동이 꺼져버렸다...");
	}

	@Override
	public String toString() {
		return "Truck [payload=" + payloadWeight + ", payloadType=" + payloadType + ", name=" + name + ", type=" + type
				+ ", price=" + price + "]";
	}
	
}
