package 화면DB연결;

import java.util.ArrayList;
import java.util.Iterator;

import 자바DB연결.MemberDAO4;

public class MemberUI4 {

	public static void main(String[] args) {
		// 프로그램 시작하자마자 db에서 데이터를 가지고 오는 화면 만들기
		
		MemberDAO4 dao = new MemberDAO4();
		ArrayList<MemberVO> list = dao.list();
		if (list.size() == 0) {
			System.out.println("검색결과 없음");
		}else {
			System.out.println("검색결과는 전체 "+ list.size() + "개");
			
			for (MemberVO bag : list) {
				System.out.println(bag.getId());
				System.out.println(bag.getpw());
				System.out.println(bag.getName());
				System.out.println(bag.getTel());
				System.out.println("==============");
			}
		}
	}

}
