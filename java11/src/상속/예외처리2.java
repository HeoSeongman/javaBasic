package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("test.txt");
			writer.write("안녕\n");
			writer.write("바이바이\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
