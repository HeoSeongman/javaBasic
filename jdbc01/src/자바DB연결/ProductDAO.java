package 자바DB연결;

import java.sql.DriverManager;

import 화면DB연결.ProductVO;

public class ProductDAO {
	
	public int insert(ProductVO vo) {
		int result = 0;
		
		System.out.println("전달된 ID : " + vo.getId());
		System.out.println("전달된 NAME : " + vo.getName());
		System.out.println("전달된 CONTENT : " + vo.getContent());
		
		return result;
	}
}
