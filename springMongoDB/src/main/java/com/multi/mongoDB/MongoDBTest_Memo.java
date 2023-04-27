package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_Memo {

	public static void main(String[] args) {
		//1. 몽고db 에 연결
		MongoClient mc = new MongoClient("192.168.0.5", 27017);
		System.out.println("1. 몽고db 연결됨");
		//2. shop2 db로 연결
		MongoDatabase database = mc.getDatabase("shop2");
		System.out.println("2. shop2 에 연결됨");
		//3. memo 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memo 에 연결됨");
		
//		insertOne(collection);
//		insertMany(collection);
//		deleteOne(collection);
//		updateOne(collection);
//		updateMany(collection);
		selectList(collection);
		mc.close();
	}

	public static void insertOne(MongoCollection<Document> collection) {
		Document doc = new Document();
		doc.append("name", "song");
		doc.append("age", 500);
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		collection.insertOne(doc);
		System.out.println("4. memo insertOne");
	}
	
	public static void insertMany(MongoCollection<Document> collection) {
		List<Document> documents = new ArrayList<Document>();
		for (int i = 1; i < 5; i++) {
			Document doc = new Document();
			doc.append("name", "song" + i);
			doc.append("age", 500 + i);
			doc.append("office", i % 2 == 0 ? "busan" : "seoul");
			doc.append("phone", "01" + i);
			documents.add(doc);
		}
		
		collection.insertMany(documents);
		System.out.println("4. memo insertMany");
	}

	public static void deleteOne(MongoCollection<Document> collection) {
		Document filter = new Document();
		filter.append("age", 500);
		
		collection.deleteOne(filter);
		System.out.println("4. memo deleteOne");
	}

	public static void updateOne(MongoCollection<Document> collection) {
		Document filter = new Document();
		filter.append("age", 501);
		Bson update = Updates.set("name", "songsong");
		
		collection.updateOne(filter, update);
		System.out.println("4. memo updateOne");
	}

	public static void updateMany(MongoCollection<Document> collection) {
		Document filter = new Document();
		filter.append("office", "busan");
		Bson update1 = Updates.set("phone", "999");
		Bson update2 = Updates.set("name", "songsong2");
		Bson update3 = Updates.set("age", 555);
		
		Bson combine = Updates.combine(update1, update2, update3);
		
		collection.updateOne(filter, combine);
		System.out.println("4. memo updateMany");
	}
	
	public static void selectList(MongoCollection<Document> collection) {
		FindIterable<Document> find = collection.find();
		List<MemoVO> list = new ArrayList<MemoVO>();
		
		for (Document doc : find) {
			//list.add(new MemoVO(doc.getString("name"), doc.getInteger("age"), doc.getString("office"), doc.getString("phone")));
		}
		
		for (MemoVO vo : list) {
			System.out.println(vo);
		}
	}
}

