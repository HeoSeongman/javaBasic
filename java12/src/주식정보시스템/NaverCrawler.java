package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverCrawler {
	
	public void startCroll(String qcode) {
		Connection connect = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + qcode);
		
		Document doc = null;
		try {
			doc = connect.get();
//			System.out.println(doc);
			
//			System.out.println(doc.select("#content .no_data").size());
			
			if (doc.select("#content .no_data").size() == 0) {
//				System.out.println("Is null");
				JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
			} else {
				String code = doc.select(".code").get(0).text();
				System.out.println("코드는 " + code);
				
				String company = doc.select(".wrap_company h2").get(0).text();
				System.out.println("사명은 " + company);
				
				Elements list = doc.select("span.blind");
				
				String current = list.get(12).text();
				System.out.println("현재가 " + current);
				
				String min = list.get(20).text();
				System.out.println("최저가 " + min);
				
				String max = list.get(16).text();
				System.out.println("최고가 " + max);
				System.out.println();
				
				FileWriter writer = new FileWriter(company + ".txt", true);
				writer.write("코드는 " + code + '\n');
				writer.write("사명은 " + company + '\n');
				writer.write("현재가 " + current + '\n');
				writer.write("최저가 " + min + '\n');
				writer.write("최고가 " + max + '\n');
				writer.write('\n');
				writer.close();		
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
