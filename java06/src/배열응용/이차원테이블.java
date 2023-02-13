package 배열응용;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		
		String header[] = {"국가", "금", "은", "동"};
		String contents[][] = {
				{"A", "25", "21","15"},
				{"B", "17", "19","14"},
				{"C", "22", "17","18"},
				{"D", "12", "11","10"},
				{"E", "25", "21","15"},
				{"F", "17", "19","14"},
				{"G", "22", "17","18"},
				{"H", "12", "11","10"},
				{"I", "25", "21","15"},
				{"J", "17", "19","14"},
				{"K", "22", "17","18"},
				{"L", "12", "11","10"},
				{"M", "25", "21","15"},
				{"N", "17", "19","14"},
				{"O", "22", "17","18"},
				{"P", "12", "11","10"},
				{"Q", "12", "11","10"},
				{"R", "25", "21","15"},
				{"S", "17", "19","14"},
				{"T", "22", "17","18"}
		};
		JTable t = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(t);
	
		
		f.add(scroll);
		f.setVisible(true);
	}

}
