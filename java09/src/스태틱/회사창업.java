package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		직원 worker1 = new 직원("홍길동", 25, '여');
		직원 worker2 = new 직원("김길동", 24, '남');
		직원 worker3 = new 직원("송길동", 26, '여');
		
		// 1.
		System.out.println("우리 회사의 직원 수는 ? => " + 직원.getCount() + '\n');
		
		// 2.
		System.out.println("우리 회사의 직원 각각의 정보를 프린트.");
		System.out.println(worker1);
		System.out.println(worker2);
		System.out.println(worker3);
		System.out.println();
		
		// 3.
		System.out.println("우리 회사의 직원의 평균 나이를 프린트 => " + ((double)직원.getTotalAge() / 직원.getCount()));
	}

}
