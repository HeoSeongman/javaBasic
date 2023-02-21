package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		Connection connect = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1. 네트워크 연결 성공. " + connect);
		
		Document doc = null;
		try {
			doc = connect.get();
			Elements elements = doc.select(".code");
			System.out.println(elements.get(0).text()); // 종목 코드
			
			Elements select = doc.select(".sptxt.sp_txt9");
			System.out.println(select.get(0).text()); // 거래량
			
//			Elements select2 = doc.select(".no_down");
////			System.out.println(select2);
//			Elements select3 = select2.select(".blind");
//			System.out.println(select3.get(0).text()); // 현재가
			
//			System.out.println(doc.select(".no_down .blind").get(0).text().replace(",", ""));
			System.out.println(doc.select("span.blind"));
			
			System.out.println(doc.select("span.blind").get(16).text());
			System.out.println(doc.select("span.blind").get(20).text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
