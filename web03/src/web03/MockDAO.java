package web03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MockDAO {
	
	static String url = "jdbc:mysql://localhost:3306/multidb";
	static String user = "root";
	static String pw = "root";
	
	public int insert(MockVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "insert into mock values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getFirstName());
			ps.setString(3, vo.getLastName());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getGender());
			ps.setString(6, vo.getAddress());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
		}
		
		return result;
	}
	
	public int delete(String id) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "delete HR.MEMBER where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
		}
		
		return result;
	}
	
	public void update(MockVO vo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "update HR.MEMBER set TEL = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MockVO select(String id) {
		MockVO vo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
//			2. 오라클 11g와 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "select * from HR.EXAM_REVIEW";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ResultSet result = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
			if (result != null) {
				System.out.println("검색결과 있음.");
				
				while (result.next()) {
					System.out.println(result.getString(1) + ", "
							+ result.getString(2) + ", "
							+ result.getString(3) + ", "
							+ result.getString(4));					
				}
				
				
			} else {
				System.out.println("검색결과 없음.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public int login(MockVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "select * from HR.MEMBER where id = ? and pw = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			System.out.println("3. SQL문 객체로 만들어주기");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				result = 1;
			} else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (Exception e) {
			
		}
		
		return result;
	}
}
