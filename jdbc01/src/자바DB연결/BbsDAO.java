package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;

public class BbsDAO {
	
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "system";
	static String password = "oracle";
	
	// BBS용 CUD 만들기
	public int insert(String no, String title, String content, String writer) {
		int result = 0;
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into HR.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(String no) {
		int result = 0;
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			String sql = "delete HR.BBS where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, no);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int update(String no, String content) {
		int result = 0;
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			String sql = "update HR.BBS set content = ? where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, no);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public BbsVO select(int no) {
		BbsVO vo = null;
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from HR.BBS where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, String.valueOf(no));
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ResultSet result = ps.executeQuery();
			if (result.next()) {
				System.out.println("검색 결과 있음");
				vo = new BbsVO(Integer.parseInt(result.getString(1)), 
						result.getString(2),
						result.getString(3),
						result.getString(4));
			} else {
				System.out.println("검색 결과 없음");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
}
