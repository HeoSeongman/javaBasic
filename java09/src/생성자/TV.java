package 생성자;

public class TV {
	public int ch;
	public int vol;
	public boolean onOff;
	public final int type;
	
	// 기본 생성자
	public TV() {
		type = 1;
		System.out.println("TV 클래스의 기본 생성자가 호출됨.");
	}
	
	public TV(int ch, int vol, boolean onOff, int type) {
		System.out.println("할당 전 ch : " + this.ch);
		this.ch = ch;
		System.out.println("할당 후 ch : " + this.ch);
		
		System.out.println("할당 전 vol : " + this.vol);
		this.vol = vol;
		System.out.println("할당 후 vol : " + this.vol);
		
		System.out.println("할당 전 onOff : " + this.onOff);
		this.onOff = onOff;
		System.out.println("할당 후 onOff : " + this.onOff);
		
		System.out.println("할당 전 type 호출 불가.");
		this.type = type;
		System.out.println("할당 전 type : " + this.type);
	}
	
	public POWER power;
	
	public void changeChannel() {
		int change = 1;
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	
	public void watchYoutube() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
	
	public static enum POWER {
		OFF,
		ON
	}
}
