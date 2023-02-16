package 스태틱;

public class Day {
	private String doing;
	private int time;
	private String location;
	
	private static int count = 0;
	private static int sum = 0;
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		
		count++;
		sum += time;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	public static int getCount() {
		return count;
	}
	
	public static int getSum() {
		return sum;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		sum -= time;
	}
	
	
}
