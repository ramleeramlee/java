package 화면DB연결;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;



import 자바DB연결.ShareDAO;

public class ShareUI_검색 {
	


	public static void open(String id) {
		JFrame f = new JFrame();
		f.setTitle("게시판");
		f.setSize(500, 400);
		
		JLabel label1 = new JLabel(" ▷▷ 검색결과 ◁◁ ");
		JLabel label6 = new JLabel("=====================");
		
		
		ShareDAO dao = new ShareDAO();
	
		ArrayList<ShareVO> list2 = dao.list2(id);
		
		String[] header = {"게시판넘버", "아이디", "책 제목", "북 넘버"};
		Object[][] all = new Object[list2.size()][4]; //섞여있음 object사용
		
		if (list2.size() == 0) {
			System.out.println("검색결과 없음");
		}else {
			System.out.println("검색결과는 전체 "+ list2.size() + "개");
			for (int i = 0; i < all.length; i++) {//행 카운트하는 가방
				all[i][0] = list2.get(i).getNo();
				all[i][1] = list2.get(i).getId();
				all[i][2] = list2.get(i).getTitle();
				all[i][3] = list2.get(i).getBook();
				
			}
			
		}
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		
		
		table.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int rowNo = table.getSelectedRow();
			
				Object no = table.getModel().getValueAt(rowNo, 0);
				Object id = table.getModel().getValueAt(rowNo, 1);
				Object title = table.getModel().getValueAt(rowNo, 2);
				Object book = table.getModel().getValueAt(rowNo, 3);
				
				JOptionPane.showMessageDialog(table, no + " " + id + " " + title + " " + book);
				
				
			}

			
		});
	
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("굴림", Font.BOLD, 30);
	
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


	

