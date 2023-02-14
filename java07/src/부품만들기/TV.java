package 부품만들기;

public class TV {
	public int ch;
	public int vol;
	public boolean onOff;
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
