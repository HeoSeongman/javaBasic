package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	public void insert(String id, String pw, String name, String tel) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
//			2. 오라클 11g와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "insert into HR.MEMBER values (?, ?, ?, ?)";
//			String sql = "insert into HR.MEMBER values ('" + id + "', '" + pw + "', '" + name + "', '" + tel + "')";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
