package 문제3;

public class CoffeeTruck extends Truck {
							// 이 커피트럭은 단일 메뉴입니다.
	protected String menu; // 메뉴 이름
	protected int menuPrice; // 메뉴 가격
	
	public CoffeeTruck(String name, String type, int price, int payloadWeight, String payloadType, String menu, int menuPrice) {
		super(name, type, price, payloadWeight, payloadType);
		this.menu = menu;
		this.menuPrice = menuPrice;
	}

	@Override
	public void run() {
		System.out.println(name + "가 출발한다. 장사 접고 출발하자~ 부와앙아칵악~!! 덜그럭덜그럭! 쨍그랑~! 아.. 컵 깨졌다.");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [menu=" + menu + ", price=" + price + ", payload=" + payloadWeight + ", payloadType="
				+ payloadType + ", name=" + name + ", type=" + type + "]";
	}
	
}
