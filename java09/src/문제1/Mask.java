package 문제1;

public class Mask {
	private String color;
	private int price;
	private int amount;
	
	public Mask(String color, int price, int amount) {
		super();
		this.color = color;
		this.price = price;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", amount=" + amount + "]";
	}
	
}
