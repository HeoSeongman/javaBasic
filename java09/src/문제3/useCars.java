package 문제3;

public class useCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("아반떼", "준중형", 20000000);
		
		Truck truck = new Truck("봉고", "1톤 트럭", 22000000, 500, "배추");
		
		CoffeeTruck coffeeTruck = new CoffeeTruck("파비스", "5톤트럭", 80000000, 3500, "푸드트럭 자재 및 차박용품", "카페라떼", 4000);
		
		System.out.println(car.toString());
		System.out.println(truck.toString());
		System.out.println(coffeeTruck.toString())
		;
		System.out.println("\n-------------------------------------\n");
		
		car.run();
		truck.run();
		coffeeTruck.run();
	}

}
