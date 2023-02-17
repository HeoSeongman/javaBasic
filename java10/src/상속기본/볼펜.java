package 상속기본;

public class 볼펜 extends 학용품 {
	double thickness;

	public 볼펜(int price, String company, double thickness) {
		super(price, company);
		this.thickness = thickness;		
	}
	
	public void write() {
		System.out.println(getClass().getName() + "으로 글을 씁니다.");
	}

	@Override
	public String toString() {
		return "볼펜 [price=" + price + ", company=" + company + ", thickness=" + thickness + "]";
	}
	
	
}
