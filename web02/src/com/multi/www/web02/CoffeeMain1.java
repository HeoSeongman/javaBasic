package com.multi.www.web02;

public class CoffeeMain1 {

	public static void main(String[] args) {
		Coffee1 c1 = new Coffee1(2000, "아메리카노");
		Coffee1 c2 = new Coffee1(3000, "카페라떼");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
