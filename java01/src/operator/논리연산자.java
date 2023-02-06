package operator;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println("아이디가 같은지 비교 : " + (id == id2));
		System.out.println("비밀번호가 같은지 비교 : " + (pw == pw2));
		System.out.println("비밀번호가 같은지 비교 : " + (id == id2 && pw == pw2));
		
		int mem1 = 111, mem2 = 223;
		System.out.println(mem1 == 111 || mem2 == 222);
		
		// 1. int double char boolean String
		// 2. && or not
		// 3. int
		// 4. double
		// 5. 변수를 선언한다.
	}

}
