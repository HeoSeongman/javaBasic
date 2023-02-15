package 클래스복습;

import java.awt.Color;

public class Car사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color = Color.black;
		car2.color = Color.red;
		
		System.out.println(car1.color);
		System.out.println(car2.color);
		
		car1.run();
		car2.run();
		car2.speedUp();
	}

}
