package 자바DB연결;

import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class 멤버1명검색 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 ID를 입력하세요.");
		
		String id = sc.next();
		MemberDAO3 dao = new MemberDAO3();
		MemberVO vo = dao.select(id);
		String total = vo.getId() + ", " + vo.getPw() + ", " + vo.getName() + ", " + vo.getTel();
		JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);
		JOptionPane.showMessageDialog(dialog, "Total : " + total);
		System.out.println("Total : " + total);
	}

}
