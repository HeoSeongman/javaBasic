package 인터페이스;

public class BananaComputer implements Computer {
	
	private String userName;
	private boolean isPowerOn;
	private int useTime;
	
	public BananaComputer(String userName, boolean isPowerOn, int useTime) {
		super();
		this.userName = userName;
		this.isPowerOn = isPowerOn;
		this.useTime = useTime;
	}

	@Override
	public void powerOn() {
		this.isPowerOn = !this.isPowerOn;
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public int getUseTime() {
		return this.useTime;
	}
	
	
}
