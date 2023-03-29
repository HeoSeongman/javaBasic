package 조별과제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import 자바DB연결.MemberVO;

public class ExamReviewDAO {
	
	public int insert(ExamReviewVO vo)	{
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "insert into HR.EXAM_REVIEW values (HR.REVIEW_NO_SEQ.nextval, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public ArrayList<ExamReviewVO> getReviewList()	{
		ArrayList<ExamReviewVO> reviewList = new ArrayList<ExamReviewVO>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "select er.ID, er.TITLE from HR.EXAM_REVIEW er order by er.ID";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				reviewList.add(new ExamReviewVO(Integer.parseInt(result.getString(1)), result.getString(2), null, null));
			}
			
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return reviewList;
	}
	
	public ExamReviewVO getReview(int reviewID) {
		ExamReviewVO vo = null;
		System.out.println("reviewID : " + reviewID);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클DB 드라이버 확인 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클DB 연결 성공");
			
			String sql = "select * from HR.EXAM_REVIEW where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, String.valueOf(reviewID));
			System.out.println("3. SQL문 객체로 만들어주기");
			
			ResultSet result = ps.executeQuery();
			if (result.next()) {
				vo = new ExamReviewVO(Integer.parseInt(result.getString(1)), result.getString(2), result.getString(3), result.getString(4));				
			}
			
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return vo;
	}
	
	public int delete(int id) {
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
			
			String sql = "delete HR.EXAM_REVIEW where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, String.valueOf(id));
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public int update(ExamReviewVO vo) {
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
			
			String sql = "update HR.EXAM_REVIEW set TITLE = ?, CONTENT = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, String.valueOf(vo.getId()));
			System.out.println("3. SQL문 객체로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
