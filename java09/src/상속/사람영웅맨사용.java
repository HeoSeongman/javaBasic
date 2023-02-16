package 상속;

public class 사람영웅맨사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사람 in = new 사람("홍길동", 26);
		in.eat();
		in.sleep();
		
		사람 out = new 맨("청길동", 26, 5);
		out.eat();
		out.sleep();
		
		수퍼맨 sman = new 수퍼맨("클라크", 2000, 50000, true);
		sman.eat();
		sman.sleep();
		sman.space();
		
		원더우먼 wman = new 원더우먼("원더씨", 1997, 50000, true);
		wman.eat();
		wman.sleep();
		wman.space();
	}

}
