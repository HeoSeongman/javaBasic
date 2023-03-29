package com.multi.www.web02;

public class Car2 {
	
	String color;
	int price;
	int speed;
	private static Car2 car2;
	
	public static Car2 getInstance() {
		if (car2 == null) {
			car2 = new Car2("빨강", 10, 100);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~~~~~~~~~~~~~");
	}
	
	private Car2(String color, int price, int speed) {
		super();
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	
}
