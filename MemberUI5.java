package 화면DB연결;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import 자바DB연결.MemberDAO4;

public class MemberUI5 {

	public static void main(String[] args) {
		// 프로그램 시작하자마자 db에서 데이터를 가지고 오는 화면 만들기
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		MemberDAO4 dao = new MemberDAO4();
		ArrayList<MemberVO> list = dao.list();
		
		String[] header = {"아이디", "패스워드", "이름", "전화번호"};
		Object[][] all = new String[list.size()][4]; //섞여있음 object사용
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음");
		}else {
			System.out.println("검색결과는 전체 "+ list.size() + "개");
			for (int i = 0; i < all.length; i++) {//행 카운트하는 가방
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getpw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getTel();
				
			}
			
		}
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		
		f.setLayout(new FlowLayout());
		
		f.add(scroll);
		
		
		
		
		
		
		
		f.setVisible(true); //main 끝나기 전에 적어주면 됨
	}

}
