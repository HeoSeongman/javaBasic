package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone = "     011-245-1234       ";
		phone = phone.trim();
		
		String[] phone1 = phone.split("-");
		
		switch(phone1[0]) {
		case "011":
			System.out.println("SK");
			break;
		case "019":
			System.out.println("LG");
			break;
		default:
			System.out.println("Apple");
			break;
		}
		
		if (phone1[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int sum = 0;
		for (int i = 0; i < phone1.length; i++) {
			sum += phone1[i].length();
		}
		
		System.out.println("전화번호 길이 => " + sum);
	}

}
