package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 500);
		frame.setLayout(new FlowLayout());
		
		frame.add(new JButton("나는 버튼"));
		frame.setVisible(true);
	}

}
