package com.multi7.myStageBox;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component
public class ContactDAO {
	
	SqlSessionTemplate sql;

	public ContactDAO(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}
	
	public int create(ContactVO vo) {
		return sql.insert("contact.create", vo);
	}
	
	public int updateAnswer(ContactVO vo) {
		return sql.update("contact.updateAnswer", vo);
	}
	
	public List<ContactVO> selectList(String member) {
		return sql.selectList("contact.selectList", member);
	}
}
