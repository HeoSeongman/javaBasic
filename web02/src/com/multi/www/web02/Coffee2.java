package com.multi.www.web02;

public class Coffee2 {
	
	private int price;
	private String name;
	private static Coffee2 coffee;
	
	public static Coffee2 getInstance() {
		if (coffee == null) {
			coffee = new Coffee2(2000, "얼죽아");
		}
		return coffee;
	}
	
	private Coffee2(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coffee1 [price=" + price + ", name=" + name + "]";
	}
	
	
}
