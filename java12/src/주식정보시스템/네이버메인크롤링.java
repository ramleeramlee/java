package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1.네트워크 연결 성공" + con);
		
		Document doc = null; //로컬변수로 수동으로 초기화 해주어야 함!!
		try {
			doc = con.get();
			Elements list = doc.select(".nav"); //<a class = "nav">
			System.out.println(list.size());
			//System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); //tag추출
				//System.out.println(tag1);
				String text1 = tag1.text(); //<a class = "nav">메일</a>
				System.out.println(text1);
				//클래스가 nav인 태그를 다 가지고 와서 ArrayList를 상속받은 Elements에 자동으로 넣어준다
				//[Element, Element, Element(tag)]
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놓음
		//System.out.println(doc);
		
		
	}

}
