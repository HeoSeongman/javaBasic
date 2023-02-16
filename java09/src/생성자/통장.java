package 생성자;

public class 통장 {
	private String name;
	private String ssn;
	private int money;
	
	public 통장(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	
}
