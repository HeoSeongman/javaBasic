package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결테스트3_Delete {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
//			2. 오라클 11g와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
//			String sql = "insert into HR.BBS values (6, '화요일', '3월 7일이고 화요일', 'apple')";
			String sql = "delete from HR.BBS where no = 6";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
