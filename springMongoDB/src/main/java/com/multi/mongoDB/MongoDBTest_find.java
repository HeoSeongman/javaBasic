package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_find {

	public static void main(String[] args) {
		//1. 몽고db 에 연결
		MongoClient mc = new MongoClient("192.168.0.5", 27017);
		System.out.println("1. 몽고db 연결됨");
		//2. shop2 db로 연결
		MongoDatabase database = mc.getDatabase("shop2");
		System.out.println("2. shop2 에 연결됨");
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("2. member 에 연결됨");
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		FindIterable<Document> find = collection.find();
		
		for (Document document : find) {
			System.out.println(document);
			list.add(new MemberVO(document.getString("id"), document.getString("pw"), document.getString("name"), document.getString("tel")));
		}
		
		for (MemberVO vo : list) {
			System.out.println(vo.toString());
		}
	
	}

}
