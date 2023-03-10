package 화면DB연결;

public class ShareVO {
	private int no;
	private String id;
	private String title;
	private String book;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "ShareVO [no=" + no + ", id=" + id + ", title=" + title + ", book=" + book + "]";
	}
	
	
	
	
}
