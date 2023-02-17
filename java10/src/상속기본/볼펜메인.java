package 상속기본;

public class 볼펜메인 {
	
	public static void main(String[] args) {
		학용품 pen1 = new 학용품(1000, "모나미");
		볼펜 bollPen = new 볼펜(2000, "스트림", 1.3);
		
		pen1.buy();
		bollPen.buy();
		
		System.out.println(pen1);
		System.out.println(bollPen);
	}
		
}
