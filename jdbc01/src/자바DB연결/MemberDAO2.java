package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO2 {
	
	public int insert(String id, String pw, String name, String tel) {
		int result = 0;
		
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
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(String id) {
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
//			2. 오라클 11g와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "delete HR.MEMBER where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public void update(String id, String column, String data) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
//			2. 오라클 11g와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "update HR.MEMBER set " + column +" = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, data);
			ps.setString(2, id);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet select(String id) {
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
//			2. 오라클 11g와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "select NAME, TEL from HR.MEMBER where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeQuery();
//			System.out.println(result.next());
//			System.out.println(result.getString(1));
//			System.out.println(result.getString(2));
			
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
