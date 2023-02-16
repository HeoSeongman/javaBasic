package 스태틱;

public class 직원 {
	private String name;
	private int age;
	private char gender;
	
	private static int count = 0;
	private static int totalAge = 0;
	
	public 직원(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		count++;
		totalAge += age;
	}
	
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}



	public static int getCount() {
		return count;
	}
	
	public static int getTotalAge() {
		return totalAge;
	}
	
}
