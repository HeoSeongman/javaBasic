package 상속응용;

public class PC상황표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		카운트스레드 count = new 카운트스레드();
		이미지스레드 image = new 이미지스레드();
		
		count.start();
		image.start();
	}

}
