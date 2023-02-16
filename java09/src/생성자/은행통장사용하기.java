package 생성자;

public class 은행통장사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		통장 여행통장 = new 통장("내이름", "123456", 1000000);
		통장 비상금통장 = new 통장("내이름", "123456", 200000);
		
		System.out.println(여행통장.toString());
		System.out.println(비상금통장.toString());
	}

}
