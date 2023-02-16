package 스태틱;

public class Memo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Day day1 = new Day("1일차", 8, "철근 콘크리스 속");
		System.out.println(Day.getCount());
		System.out.println("현재 누적 시간 : " + Day.getSum());
		
		Day day2 = new Day("2일차", 1, "시원한 산 속");
		System.out.println(Day.getCount());
		System.out.println("현재 누적 시간 : " + Day.getSum());
		
		Day day3 = new Day("3일차", 2, "모니터 속");
		System.out.println(Day.getCount());
		System.out.println("현재 누적 시간 : " + Day.getSum());

		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		day1.finalize();
		day2.finalize();
		day3.finalize();
		
		System.out.println(Day.getSum());
		
	}

}
