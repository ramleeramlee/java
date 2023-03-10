package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import 자바DB연결.ShareDAO;

public class ShareUI_검색 {
	
	public static void open() {
		
		JFrame f = new JFrame();
		f.setTitle("게시판");
		f.setSize(500, 500);
		
		JLabel label1 = new JLabel(" ▷▷ 검색완료 ◁◁ ");
		JLabel label6 = new JLabel("=====================");
		
		
		ShareDAO dao = new ShareDAO();
		ArrayList<ShareVO> list = dao.list();
		
		String[] header = {"게시판넘버", "아이디", "책 제목", "북 넘버"};
		Object[][] all = new Object[list.size()][4]; //섞여있음 object사용
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음");
		}else {
			System.out.println("검색결과는 전체 "+ list.size() + "개");
			JOptionPane.showMessageDialog(f, "검색완료");
			for (int i = 0; i < all.length; i++) {//행 카운트하는 가방
				all[i][0] = list.get(i).getNo();
				all[i][1] = list.get(i).getId();
				all[i][2] = list.get(i).getTitle();
				all[i][3] = list.get(i).getBook();
				
			}
			
		}
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
			
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("굴림", Font.BOLD, 40);
		
		f.setLayout(flow);
		f.add(label1);
		f.add(label6); 
		f.add(scroll); 
	
		label1.setFont(font);
		label6.setFont(font);
	
		
		f.getContentPane().setBackground(Color.lightGray);
		
		
		
		f.setVisible(true);
	
	}
	}


