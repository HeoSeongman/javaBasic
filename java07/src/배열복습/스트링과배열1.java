package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "나는 프로그래머프야";
		String s2 = "진짜!!";
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(0));
		char c = s1.charAt(0);
		System.out.println(s1.endsWith("야"));
		boolean ends = s1.endsWith("야");
		s1.substring(3);
		String sub1 = s1.substring(3); // 3번 인덱스부터 끝까지 추출
		String sub2 = s1.substring(3, 8); // 3번 인덱스부터 8번 인덱스까지 추출
		boolean contain = s1.contains(s2);
		int index = s1.lastIndexOf("프");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		s1.replace("나", "너");
		System.out.println(s1);
	}

}
