package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"커리","치킨","샐러드"},
				{"오카사","오키나와","스위스"},
				{"다이어트","옷장","침대"}
		}; 
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		
	}

}
