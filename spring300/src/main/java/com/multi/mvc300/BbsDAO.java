package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 스프링 컨테이너에 빈으로 등록한다.(싱글톤으로 동작한다. 등록하지 않으면 사용할 때 마다(주입 받을 때 마다) 새로운 객체를 생성한다.)
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BbsVO vo) {
		return my.insert("bbs.create", vo);
	}
	
	public int update(BbsVO vo) {
		return my.insert("bbs.update", vo);
	}
	
	public int delete(int no) {
		return my.insert("bbs.delete", no);
	}
	
	public BbsVO select(int no) {
		return my.selectOne("bbs.select", no);
	}
	
	public List<BbsVO> list() {
		return my.selectList("bbs.list");
	}
	
}
