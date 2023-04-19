package com.multi.mvc901;

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
}
