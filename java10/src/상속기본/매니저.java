package 상속기본;

public class 매니저 extends 직원 {
	
	int bonus;

	public 매니저(String name, String address, int salary, String rrn, int bonus) {
		super(name, address, salary, rrn);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "매니저 [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn
				+ "]";
	}
	
	public void test() {
		
	}
	
}
