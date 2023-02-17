package 상속기본;

public class 커피전문점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		매니저 manager = new 매니저("매니저1번", "매니저1번 주소", 1000, "990701", 3000);
		
		직원 employee = new 직원("직원2번", "직원2번 주소", 800, "800325");
		
		System.out.println(manager);
		System.out.println(employee);
	}

}
