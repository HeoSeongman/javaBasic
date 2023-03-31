package com.multi.mvc00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component // 스프링 컨테이너에 빈으로 등록한다.(싱글톤으로 동작한다. 등록하지 않으면 사용할 때 마다(주입 받을 때 마다) 새로운 객체를 생성한다.)
public class MusicDAO {
	
	static String url = "jdbc:mysql://localhost:3306/multidb";
	static String user = "root";
	static String pw = "root";
	
	public int insert(MusicVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "insert into music values (?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getGenre());
			ps.setString(5, vo.getAlbum());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(int id) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "delete from music where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public void update(MusicVO vo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "update music set name = ?, singer = ?, album = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSinger());
			ps.setString(3, vo.getAlbum());
			ps.setInt(4, vo.getId());
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MusicVO select(int id) {
		MusicVO vo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from music where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet result = ps.executeQuery();
			
			if (result.next()) {
				vo = new MusicVO(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
			} else {
				System.out.println("music 검색 결과 없음.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public ArrayList<MusicVO> list() {
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from music";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet result = ps.executeQuery();
			
			while (result.next()) {
				list.add(new MusicVO(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
