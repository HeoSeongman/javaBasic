package 부품만들기;

public class 강아지 {
	public String 이름;
	public String 품종;
	public int 나이;
	public String 울음소리;
	
	public void 소개하다() {
		System.out.println("이름은 " + 이름 + ", 품종은 " + 품종 + ", 나이는 " + 나이 + "세 입니다.");
	}
	
	public void 짖기() {
		System.out.println(이름 + "가 '" + 울음소리 + "' 소리를 내며 짖어댑니다.");
	}
}
