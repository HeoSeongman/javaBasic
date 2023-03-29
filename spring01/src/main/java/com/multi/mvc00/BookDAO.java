package com.multi.mvc00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {
	
	static String url = "jdbc:mysql://localhost:3306/multidb";
	static String user = "root";
	static String pw = "root";
	
	public int insert(BookVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "insert into book values (?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, null);
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getUrl());
			ps.setString(4, vo.getImg());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public int update(BookVO vo) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "update book set url = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, vo.getUrl());
			ps.setInt(2, vo.getId());
			
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
			
			String sql = "delete from book where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			result = ps.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return result;
	}
	
	public BookVO select(int id) {
		BookVO vo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from book where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet executeQuery = ps.executeQuery();
			if (executeQuery.next()) {
				vo = new BookVO(executeQuery.getInt(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4));
			}
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		return vo;
	}
}
