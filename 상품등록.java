package 자바DB연결;

import java.util.Scanner;

import 화면DB연결.ProductVO;

public class 상품등록 {

	public static void main(String[] args) { //메인부터 시작
		
		Scanner sc = new Scanner(System.in); //스캐너프로그램으로 콘솔에 입력 할 수 있다.in은 키보드 의미
		System.out.println("id/name/content 순으로 입력하세요");
		String id = sc.next(); //텍스트로(공백허용x) id를 입력
		String name = sc.next();
		String content = sc.next();
	
		//1. 가방을 만든다
		ProductVO bag = new ProductVO();
		
		//2. 가방에 데이터를 하나씩 넣는다 >> set
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content);
		
		//3. 가방을 전달해라
		ProductDAO dao = new ProductDAO();
		dao.insert(bag);
	}

}
