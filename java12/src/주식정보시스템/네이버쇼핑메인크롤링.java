package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버쇼핑메인크롤링 {

	public static void main(String[] args) {
		Connection connect = Jsoup.connect("http://shopping.naver.com/home");
		
		Document doc = null;
		try {
			doc = connect.get();
			Elements elements = doc.select("._lnb_text_3f3tB"); // html 요소들을 반환
//			System.out.println(elements.size());
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).text());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
