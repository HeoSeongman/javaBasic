package 생성자;

public class 전화기사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		전화기 phone1 = new 전화기();
		phone1.price = 1350000;
		phone1.shape = "폴더";
		phone1.인터넷하다();
		System.out.println("phone1의 가격 : " + phone1.price);
		System.out.println("phone1의 모양 : " + phone1.shape);
		
		전화기 phone2 = new 전화기();
		phone2.price = 1100000;
		phone2.shape = "슬라이드";
		phone2.카톡하다();
		System.out.println("phone2의 가격 : " + phone2.price);
		System.out.println("phone2의 모양 : " + phone2.shape);
		
	}

}
