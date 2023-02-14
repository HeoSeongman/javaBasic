package 배열복습;

public class 스트링과배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "감자,고구마,양파";
		String[] s2 = s1.split(",");
		
		System.out.println(s2.length);
		System.out.println(s2[0]);
		
		String s3 = "감자 고구마 양파";
		String[] s4 = s3.split(" ");
		System.out.println(s4.length);
		System.out.println(s4[0]);
		
		String s5 = "          홍길동";
		String s6 = s5.replace(" ",	"");
	}

}
