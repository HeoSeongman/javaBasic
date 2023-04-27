package com.multi.mongoDB;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_Insert2 {

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
		
		Scanner sc = new Scanner(System.in);
		Document doc = new Document();
		System.out.print("id >> ");
		doc.append("id", sc.next());		
		System.out.print("pw >> ");
		doc.append("pw", sc.next());
		System.out.print("name >> ");
		doc.append("name", sc.next());
		System.out.print("tel >> ");
		doc.append("tel", sc.next());
		sc.close();
		
		collection.insertOne(doc);
		System.out.println("4. insertOne 성공");
	}

}
