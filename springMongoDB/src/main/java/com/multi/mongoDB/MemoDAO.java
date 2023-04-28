package com.multi.mongoDB;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
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
		query.with(new Sort(Sort.Direction.DESC, "_id"));
		
		// (쿼리, 결과를 담을 클래스, 검색할 컬렉션)
		return mongo.find(query, MemoVO.class, "memo");
	}
	
	public void insert(MemoVO vo) {
		vo.setDate(new Date());
		mongo.insert(vo, "memo");
	}
	
	public MemoVO one(String _id) {
		return mongo.findById(_id, MemoVO.class, "memo");
	}
	
	public void delete(String _id) {
		Query query = new Query(new Criteria("_id").is(_id));
		mongo.remove(query, "memo");
	}
	
	public void update(MemoVO vo) {
		Query query = new Query(new Criteria("_id").is(vo.get_id()));
		
		// update 객체 생성
		Update update = new Update();
		// update 할 내용 지정
		update.set("content", vo.getContent());
		
		mongo.updateMulti(query, update, MemoVO.class, "memo");
	}
}
