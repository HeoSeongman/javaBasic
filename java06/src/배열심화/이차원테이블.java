package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		String[] header = {"a", "b", "c"};
		String[][] contents = {
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		
		frame.add(scroll);
		frame.setVisible(true);
	}

}
