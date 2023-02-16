package 생성자;

public class TV사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TV tv1 = new TV();
//		tv1.ch = 10;
//		tv1.vol = 9;
//		tv1.onOff = true;
		TV tv1 = new TV(10, 8, true, 99);
		tv1.power = TV.POWER.ON;
		tv1.changeChannel();
		System.out.println(tv1.ch + " " + tv1.vol + " " + tv1.onOff);
		
		TV tv2 = new TV();
		tv2.ch = 20;
		tv2.vol = 15;
		tv2.onOff = false;
		tv2.power = TV.POWER.OFF;
		tv2.watchYoutube();
		System.out.println(tv2.ch + " " + tv2.vol + " " + tv2.onOff);
	}

}
