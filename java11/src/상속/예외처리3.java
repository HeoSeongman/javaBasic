package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		
		try {
			num[3] = 2;			
		} catch (Exception e) {
			System.out.println("에러 메시지");
			e.printStackTrace();
		}
		
		System.out.println(num.length);
		
		// 1. 예외처리를 왜 하는가? 
		// 내가 코드를 완벽히 작성해도 외부에서 난 오류는 어찌할 수 없기 때문에 외부상황에 대해서도 예외처리르 해야함.
		// 나만 잘한다고 되는게 아니다. 마치 교통사고와 같다.
		
		// 2. 컴파일 에러, 실행에러
		// 컴파일 에러는 대부분 개발자 실수이다.
		// 괄호 안 닫기, 세미콜론 안 빼먹기
		// 실행에러는 인덱스 범위를 벗어났을 때, 외부(파일 입출력, 네트워크 통신 등)에서 오류가 났을 때
		
		// 3. 자바에서 예외처리하는 방법
		// try catch 문, throws 던지기
		
		// 4. 반드시 예외처리를 해야 하는 경우?
		// 외부와 통신할 때
	}

}
