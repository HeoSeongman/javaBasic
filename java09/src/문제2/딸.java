package 문제2;

public class 딸 {
	private String name;
	private char gender;
	
	static int fatherWallet = 10000;
	static int children = 0;
	
	public 딸(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
		
		fatherWallet -= 1000;
		children++;
	}
	
	public static void watchTV() {
		System.out.println("아빠가 소파에 드러누워 반쯤 눈이 감긴 채 TV를 시청하는 둥 마는 둥 있습니다.");
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
