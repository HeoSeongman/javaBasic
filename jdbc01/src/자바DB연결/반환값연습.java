package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class 반환값연습 {
	
//	public void add() {
//		System.out.println("더하기 기능");
//	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(double x, int y) {
		return x + y;
	}
	
	public String add(String str1, String str2) {
		return str1 + str2;
	}
	
	public String add(int x, String y) {
		return x + y;
	}
	
	public int[] add() {
		int [] x = {1,2,3};
		return x;
	}
	
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	
	public Random getRandom() {
		Random r = new Random();
		return r;
	}
	
	public int getRandom2() {
		Random r = new Random();
		return r.nextInt();
	}
	
	public int getRandom3() {
		Date date = new Date();
		return date.getHours();
	} 
	
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("감자");
		return list;
	}
	
	public HashSet getSet() {
		HashSet set = new HashSet();
		set.add("휴지");
		set.add("펜");
		return set;
	}
	
	public Connection getConnection(String url, String username, String password) throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}








