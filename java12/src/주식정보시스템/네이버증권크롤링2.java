package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {
	//크롤링은 인터넷 문서(html)를 다 받아와서,
	//html문서를 분석(parser, 파싱!) 해서 내가 원하는 정보를 추출하는 것

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=067280");

		Document doc = null; //로컬변수로 수동으로 초기화 해주어야 함!!
		try {
			doc = con.get(); //html코드를 다 가져온다
			Elements codeList = doc.select(".code"); 
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			Elements list = doc.select(".first");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i);
				System.out.println(i + ": " + tag1.text());
			}
			
			
			Element tag2 = list.get(1);
			String yesterday = tag2.text();
			System.out.println(yesterday);
			
			
//			for (int i = 0; i <list.size(); i++) {
//				System.out.println(i + ": " + list.get(i));
//			}
			System.out.println();
			
//			System.out.println(list.get(12));
//			Element tag2 = list.get(12);
//			String today = tag2.text();
//			System.out.println("현재가" + today);
//			
//			System.out.println(list.get(20));
//			Element tag3 = list.get(20);
//			String low = tag3.text();
//			System.out.println("최저가" + low);
//			
//			System.out.println(list.get(16));
//			Element tag4 = list.get(16);
//			String high = tag4.text();
//			System.out.println("최고가" + high);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
