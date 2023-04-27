package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_Insert3 {

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
		
		List<Document> list = new ArrayList<Document>();
		for (int i = 123; i < 130; i++) {
			Document doc = new Document();
			doc.append("id", "apple" + i);
			doc.append("pw", "apple" + i);
			doc.append("name", "apple" + i);
			doc.append("tel", "apple" + i);
			list.add(doc);
		}
		
		collection.insertMany(list);
		System.out.println("4. insertMany 성공");
	}

}
