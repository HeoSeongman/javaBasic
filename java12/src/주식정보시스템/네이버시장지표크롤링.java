package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버시장지표크롤링 {

	public static void main(String[] args) {
		Connection connect = Jsoup.connect("https://finance.naver.com/marketindex/exchangeList.naver");
		
		Document doc = null;
		try {
			doc = connect.get();
//			System.out.println(doc);
//			System.out.println(doc.select(".tit").text());
			
			Elements select1 = doc.select(".tit"); // 국명 통화명
			Elements select2 = doc.select(".sale"); // 매매기준율
			
			System.out.println(doc.select("caption").text() + '\n');
			System.out.println(doc.select(".th_ex1").text() + " : " + doc.select(".th_ex2").text() + '\n');
			for (int i = 0; i < select1.size(); i++) {
				System.out.println(select1.get(i).text() + " : " + select2.get(i).text());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
