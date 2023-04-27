package com.multi7.myStageBox;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component
public class FaqDAO {
	
	SqlSessionTemplate sql;

	public FaqDAO(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}
	
	public int create(FaqVO vo) {
		return sql.insert("faq.create", vo);
	}
	
	public int updateAnswer(FaqVO vo) {
		return sql.update("faq.updateAnswer", vo);
	}
	
	public FaqVO selectOne(int id) {
		return sql.selectOne("faq.selectOne", id);
	}
	
	public List<FaqVO> selectList() {
		return sql.selectList("faq.selectList");
	}
	
	public List<FaqVO> selectListByCategory(String category) {
		return sql.selectList("faq.selectListByHelpCategory", category);
	}
	
	public List<FaqVO> selectListBySearch(String search) {
		return sql.selectList("faq.selectListBySearch", search);
	}
	
}
