package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "1987654";
		
		if (id.equals("1987654")) {
			System.out.println("동일한 지역에서 태어나셨군요.");
		} else {
			System.out.println("동일한 지역에서 태어나지 않으셨군요.");
		}
		
		switch(id.charAt(0)) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
