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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import 자바DB연결.ShareDAO;

public class ShareUI {
	

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("게시판");
		f.setSize(600, 800);
		
		JLabel label1 = new JLabel(" ▷▷ 나눔게시판 ◁◁ ");
		JLabel label6 = new JLabel("=====================");
		
		
		ShareDAO dao = new ShareDAO();
		ArrayList<ShareVO> list = dao.list();
		
		String[] header = {"게시판넘버", "아이디", "책 제목", "북 넘버"};
		Object[][] all = new Object[list.size()][4]; //섞여있음 object사용
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음");
		}else {
			System.out.println("검색결과는 전체 "+ list.size() + "개");
			for (int i = 0; i < all.length; i++) {//행 카운트하는 가방
				all[i][0] = list.get(i).getNo();
				all[i][1] = list.get(i).getId();
				all[i][2] = list.get(i).getTitle();
				all[i][3] = list.get(i).getBook();
				
			}
			
		}
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		
		JLabel label2 = new JLabel("게시판넘버");
		JLabel label3 = new JLabel("아이디");
		JLabel label4 = new JLabel("책 제목");
		JLabel label5 = new JLabel("북 넘버");
		
		
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		JTextField text4 = new JTextField(5);
		
		JButton b1 = new JButton("작성");
		JButton b2 = new JButton("수정");
		JButton b3 = new JButton("삭제");
		JButton b4 = new JButton("검색");
		
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
		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 작성");
				
				String no = text1.getText();
				int no2 = Integer.parseInt(no);
				String id = text2.getText();
				String title = text3.getText();
				String book = text4.getText();
				
				if (id.equals("")) { 
					JOptionPane.showMessageDialog(f, "id는 필수입력 항목입니다");
					
				} else {
					
				ShareDAO dao = new ShareDAO();
				ShareVO bag = new ShareVO(); 
				bag.setNo(no2);
				bag.setId(id);
				bag.setTitle(title);
				bag.setBook(book);
				
				int result = dao.insert(bag); // 1 or 0
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "게시판 작성완료");
					text1.setText(" ");
					text2.setText(" ");
					text3.setText(" ");
					text4.setText(" ");
					
					
				}else {
					JOptionPane.showMessageDialog(f, "게시판 작성 실패, 아이디 혹은 북넘버를 확인 해주세요"); 
				}
				}
			}
		
		
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 수정");
				
				String no = text1.getText();
				int no2 = Integer.parseInt(no);
				String id = text2.getText();
				String title = text3.getText();
				String book = text4.getText();
			
				ShareDAO dao = new ShareDAO();
				ShareVO bag = new ShareVO();
				bag.setTitle(title);
				bag.setBook(book);
				bag.setNo(no2);
				bag.setId(id);
				
				int result = dao.update(bag);
				if (result >= 1) {
					JOptionPane.showMessageDialog(f, "수정완료");
					text1.setText(" ");
					text2.setText(" ");
					text3.setText(" ");
					text4.setText(" ");
					
				}else {
					JOptionPane.showMessageDialog(f, "수정실패. 북넘버를 확인해주세요");
				}

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 삭제");
				String no = text1.getText();
				int no2 = Integer.parseInt(no);
			
				ShareDAO dao = new ShareDAO();
				
				int result = dao.delete(no2);
				if (result >= 1) {
					JOptionPane.showMessageDialog(f, "삭제완료");
					text1.setText(" ");
					text2.setText(" ");
					text3.setText(" ");
					text4.setText(" ");
				
				}else {
					JOptionPane.showMessageDialog(f, "삭제 실패, 게시글 번호를 다시 확인해주세요");
				}

			}
		});
		
		b4.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 검색");
				
				String id = text2.getText();
				
				ShareDAO dao = new ShareDAO();
				ArrayList<ShareVO> list2 = dao.list2(id);
				
				String[] header = {"게시판넘버", "아이디", "책 제목", "북 넘버"};
				Object[][] all = new Object[list2.size()][4]; //섞여있음 object사용
				
				if (list2.size() == 0) {
					System.out.println("검색결과 없음");
				}else {
					ShareUI_검색.open(id);
					System.out.println("검색결과는 전체 "+ list2.size() + "개");
				
					
				}
			}
		
		});
	
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("굴림", Font.BOLD, 40);
		Font font2 = new Font("굴림", Font.LAYOUT_LEFT_TO_RIGHT, 20);
		Font font3 = new Font("굴림", Font.LAYOUT_LEFT_TO_RIGHT,25);
		
		f.setLayout(flow);
		f.add(label1);
		f.add(label6); 
		f.add(scroll); 
		
		f.add(label2); f.add(text1);
		f.add(label3); f.add(text2);
		f.add(label4); f.add(text3);
		f.add(label5); f.add(text4); 
	
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		label1.setFont(font);
		label6.setFont(font);
		label2.setFont(font3);
		label3.setFont(font3);
		label4.setFont(font3);
		label5.setFont(font3);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		
		f.getContentPane().setBackground(Color.lightGray);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		b3.setBackground(Color.orange);
		b3.setForeground(Color.white);
		b4.setBackground(Color.magenta);
		b4.setForeground(Color.white);
		
		
		f.setVisible(true);
		

	}

	
	}


