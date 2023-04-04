package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component // 스프링 컨테이너에 빈으로 등록한다.(싱글톤으로 동작한다. 등록하지 않으면 사용할 때 마다(주입 받을 때 마다) 새로운 객체를 생성한다.)
public class ReplyDAO {
	
	static String url = "jdbc:mysql://localhost:3306/multidb";
	static String user = "root";
	static String pw = "root";
	
	public int insert(ReplyVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "insert into reply values (?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ps.setInt(2, vo.getBbsno());
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
			
			String sql = "delete from reply where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, no);
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public void update(ReplyVO vo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "update reply set content = ?, writer = ? where no = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getContent());
			ps.setString(2, vo.getWriter());
			ps.setInt(3, vo.getNo());
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ReplyVO select(int bbsno) {
		ReplyVO vo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from reply where bbsno = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, bbsno);
			
			ResultSet result = ps.executeQuery();
			
			if (result.next()) {
				vo = new ReplyVO(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4));
			} else {
				System.out.println("reply 검색 결과 없음.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public ArrayList<ReplyVO> list(int bbsno) {
		ArrayList<ReplyVO> list = new ArrayList<ReplyVO>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from reply where bbsno = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, bbsno);
			
			ResultSet result = ps.executeQuery();
			
			while (result.next()) {
				list.add(new ReplyVO(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4)));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	
}
