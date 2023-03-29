package com.multi.www.web02;

public class Car {
	
	String color;
	int price;
	int speed;
	
	public Car(String color, int price, int speed) {
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
