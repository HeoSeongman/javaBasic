package com.multi.mvc200;

public class ComputerVO {
	private String com;
	private String mouse;
	private int price1;
	private int price2;
	private int sum;
	
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public int getPrice1() {
		return price1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = this.price1 + this.price2;
	}
	
	@Override
	public String toString() {
		return "ComputerVO [com=" + com + ", mouse=" + mouse + ", price1=" + price1 + ", price2=" + price2 + ", sum="
				+ sum + "]";
	}
}
