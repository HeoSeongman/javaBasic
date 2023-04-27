package com.multi.mongoDB;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_Insert {

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
		
		Document doc = new Document();
		doc.append("id", "apple");
		doc.append("pw", "apple");
		doc.append("name", "heo");
		doc.append("tel", "012");
		
		collection.insertOne(doc);
		System.out.println("4. insert apple");
	}

}
