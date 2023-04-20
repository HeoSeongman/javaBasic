package com.multi.mvc901;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	SqlSessionTemplate sql;

	public MemberDAO(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}
	
	public void insert(MemberVO vo) {
		sql.insert("member.create", vo);
	}
	
	public int delete(String id) {
		return sql.delete("member.delete", id);
	}
	
	public int update(MemberVO vo) {
		return sql.update("member.update", vo);
	}
	
	public MemberVO select(String id) {
		return sql.selectOne("member.select", id);
	}
	
	public List<MemberVO> list() {
		return sql.selectList("member.selectAll");
	}
	
}
