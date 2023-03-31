package com.multi.mvc00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component // 스프링 컨테이너에 빈으로 등록한다.(싱글톤으로 동작한다. 등록하지 않으면 사용할 때 마다(주입 받을 때 마다) 새로운 객체를 생성한다.)
public class BbsDAO {
	
	static String url = "jdbc:mysql://localhost:3306/multidb";
	static String user = "root";
	static String pw = "root";
	
	public int insert(BbsVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "insert into bbs values (?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, String.valueOf(vo.getNo()));
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getWriter());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(int no) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "delete from bbs where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, no);
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public void update(BbsVO vo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "update bbs set title = ?, content = ?, writer = ? where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());
			ps.setInt(4, vo.getNo());
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BbsVO select(int no) {
		BbsVO vo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from bbs where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, no);
			
			ResultSet result = ps.executeQuery();
			
			if (result.next()) {
				vo = new BbsVO(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
			} else {
				System.out.println("Bbs 검색 결과 없음.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public ArrayList<BbsVO> list() {
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from bbs";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet result = ps.executeQuery();
			
			while (result.next()) {
				list.add(new BbsVO(result.getInt(1), result.getString(2), result.getString(3), result.getString(4)));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int login(MemberVO vo) {
		return 1;
	}
	
}
