package com.multi.www.web02;

public class MainCar2 {

	public static void main(String[] args) {
		Car car1;
		for (int i = 0; i < 1000; i++) {
			car1 = new Car("빨강" + i, 10, 200);
			System.out.println(car1);
		}
	}

}
