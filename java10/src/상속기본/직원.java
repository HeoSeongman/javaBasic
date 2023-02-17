package 상속기본;

public class 직원 {
	
	String name;
	String address;
	int salary;
	String rrn;
	
	public 직원(String name, String address, int salary, String rrn) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
