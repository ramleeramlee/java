package 생성자;

public class 컴퓨터 {
	int money; //가격
	String company; //제조회사
	int size; //모니터크기
	
	public 컴퓨터(int money, String company, int size) {
		
		this.money = money;
		this.company = company;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [money=" + money + ", company=" + company + ", size=" + size + "]";
	}
	
	
	
}
