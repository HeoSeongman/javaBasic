package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_update2 {

	public static void main(String[] args) {
		//1. 몽고db 에 연결
		MongoClient mc = new MongoClient("192.168.0.5", 27017);
		System.out.println("1. 몽고db 연결됨");
		//2. shop2 db로 연결
		MongoDatabase database = mc.getDatabase("shop2");
		System.out.println("2. shop2 에 연결됨");
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member 에 연결됨");
		
		// update 할 조건
		Document filter = new Document();
		filter.append("id", "root");
		
		// update 할 내용은 bson 을 생성
		Bson set1 = Updates.set("name", "rootC ddd");
		Bson set2 = Updates.set("tel", "ddd082");
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set1);
		list.add(set2);
		
		// update 할 내용 결합
		Bson sets = Updates.combine(list);
		
		collection.updateMany(filter, sets);
		System.out.println("4. member updateMany 성공");
	}

}
