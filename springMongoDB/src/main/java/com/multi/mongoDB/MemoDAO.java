package com.multi.mongoDB;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class MemoDAO {
	
	private MongoTemplate mongo;

	public MemoDAO(MongoTemplate mongo) {
		super();
		this.mongo = mongo;
	}
	
	public List<MemoVO> list() {
		Query query = new Query();
		//전체 검색이고, 내림차순으로 정렬
		query.with(new Sort(Sort.Direction.DESC, "name"));
		
		// (쿼리, 결과를 담을 클래스, 검색할 컬렉션)
		return mongo.find(query, MemoVO.class, "memo");
	}
}
