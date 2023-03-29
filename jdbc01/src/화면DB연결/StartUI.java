package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;
import 자바DB연결.MemberVO;

public class StartUI {

	public static void main(String[] args) {
		
		MemberDAO3 dao = new MemberDAO3();
		dao.select(String.valueOf(1));
		
//		String ID = JOptionPane.showInputDialog("아이디 입력");
//		String PW = JOptionPane.showInputDialog("비밀번호 입력");
//		
//		MemberDAO3 dao = new MemberDAO3();
//		MemberVO vo = new MemberVO(ID, PW, null, null);
//		
//		if (dao.login(vo) >= 1) {
//			JOptionPane.showMessageDialog(null, "로그인 성공.");
//			BbsUI2 bbsUI = new BbsUI2();
//		} else {
//			JOptionPane.showMessageDialog(null, "로그인 실패.");
//			JoinUI joinUI = new JoinUI();
//		}
		
		
	}

}
