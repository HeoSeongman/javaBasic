package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		Connection connect = Jsoup.connect("http://www.naver.com");
		System.out.println("1. 네트워크 연결 성공. " + connect);
		
		Document doc = null;
		try {
			doc = connect.get();
			Elements elements = doc.select(".nav"); // html 요소들을 반환
//			System.out.println(elements);
			
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).text());
			}
//			System.out.println(elements.size());
//			System.out.println(elements.get(0));
//			Element tag1 = elements.get(0);
//			String text1 = tag1.text(); // 요소의 text를 반환
//			System.out.println(text1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);
	}

}
