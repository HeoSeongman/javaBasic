package com.multi.mongoDB;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_delete2 {

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
		
		// 삭제할 조건을 json(Document)로 생성
		Document regex = new Document();		
		regex.append("$regex", "apple");
		Document filter = new Document();
		filter.append("id", regex);
		// {id : {$regex : "apple"}}
		
		// 조건에 맞는 여러 Document 를 삭제
		collection.deleteMany(filter);
		mc.close();
		System.out.println("4. 정규식을 이용한 deleteMany 성공");
	}

}
