package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기3 cal3 = new 계산기3();
		
		int price = 7000;
		int count1 = 5; // 오전에 손님 수
		int count2 = 4; // 오후에 손님 수
		
		int result1 = cal3.add(count1, count2);
		int result2 = cal3.sub(count1, count2);
		int result3 = cal3.multiply(price, count1);
		int result4 = cal3.multiply(price, count2);
		int result5 = cal3.multiply(price, result1);
		int result6 = cal3.divide(result5, result1);
		
		System.out.println("오늘 온 손님의 총 합은 " + result1 + "명입니다.");
		System.out.println("오전 오후 손님 수 차이는 " + Math.abs(result2) + "명입니다.");
		System.out.println("오전 결제금액은 " + result3 + "원입니다.");
		System.out.println("오후 결제금액은 " + result4 + "원입니다.");
		System.out.println("오늘 하루 총 결제금액은 " + result5 + "원입니다.");
		System.out.println("1인당 결제금액은 " + result6 + "원입니다.");
	}

}
