package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
//	static String url = "jdbc:mysql://localhost:3306/multidb";
//	static String user = "root";
//	static String pw = "root";
//	
//	public int insert(MemberVO vo) {
//		int result = 0;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection connection = DriverManager.getConnection(url, user, pw);
//			
//			String sql = "insert into member values (?, ?, ?, ?)";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setString(1, vo.getId());
//			ps.setString(2, vo.getPw());
//			ps.setString(3, vo.getName());
//			ps.setString(4, vo.getTel());
//			
//			result = ps.executeUpdate();
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
//		
//		return result;
//	}
//	
//	public int delete(String id) {
//		int result = 0;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection connection = DriverManager.getConnection(url, user, pw);
//			
//			String sql = "delete HR.MEMBER where id = ?";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setString(1, id);
//			
//			result = ps.executeUpdate();
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
//		
//		return result;
//	}
//	
//	public void update(MemberVO vo) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection connection = DriverManager.getConnection(url, user, pw);
//			
//			String sql = "update member set TEL = ? where id = ?";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setString(1, vo.getTel());
//			ps.setString(2, vo.getId());
//			
//			ps.executeUpdate();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public MemberVO select(String id) {
//		MemberVO vo = null;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection connection = DriverManager.getConnection(url, user, pw);
//			
//			String sql = "select * from member where id = ?";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setString(1, id);
//			
//			ResultSet result = ps.executeQuery();
//			
//			if (result.next()) {
//				vo = new MemberVO(result.getString(1), result.getString(2), result.getString(3), result.getString(4));
//			} else {
//				System.out.println("검색결과 없음.");	
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return vo;
//	}
//	
//	public ArrayList<MemberVO> selectAll() {
//		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection connection = DriverManager.getConnection(url, user, pw);
//			
//			String sql = "select * from member";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			
//			ResultSet result = ps.executeQuery();
//			
//			while (result.next()) {
//				list.add(new MemberVO(result.getString(1), result.getString(2), result.getString(3), result.getString(4)));
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return list;
//	}
//	
//	public int login(MemberVO vo) {
//		int result = 0;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection connection = DriverManager.getConnection(url, user, pw);
//			
//			String sql = "select * from member where id = ? and pw = ?";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setString(1, vo.getId());
//			ps.setString(2, vo.getPw());
//			
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				System.out.println("검색 결과가 있음.");
//				result = 1;
//			} else {
//				System.out.println("검색 결과가 없음.");
//			}
//		} catch (Exception e) {
//			
//		}
//		
//		return result;
//	}
	
	// mybatis 빈 주입
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MemberVO vo) {
		//memberMapper.xml의  namespace.id
		return my.insert("member.create", vo);
	}
	
	public int update(MemberVO vo) {
		return my.update("member.update", vo);
	}
	
	public int delete(String id) {
		return my.delete("member.delete", id);
	}
}
