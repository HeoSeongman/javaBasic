package 상속기본;

public class 학용품 {
	int price;
	String company;
	
	public 학용품(int price, String company) {
		super();
		this.price = price;
		this.company = company;
	}

	public void buy() {
		System.out.println(getClass().getSimpleName() + "을 삽니다.");
		System.out.println("가격은 " + price + "원입니다.");
	}
	
	@Override
	public String toString() {
		return "학용품 [price=" + price + ", company=" + company + "]";
	}
	
}
