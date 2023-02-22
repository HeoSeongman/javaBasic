package 인터페이스;

public class UseComputer {

	public static void main(String[] args) {
		AppleComputer ac = new AppleComputer("팀 쿡", false, 362);
		BananaComputer bc = new BananaComputer("원숭이", true, 12);
		
		System.out.println(ac.getUserName());
		System.out.println(ac.getUseTime());
		
		System.out.println(bc.getUserName());
		System.out.println(bc.getUseTime());
	}

}
