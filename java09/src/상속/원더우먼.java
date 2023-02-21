package 상속;

public class 원더우먼 extends 우먼{
	String pretty;
	
	public void p() {
		System.out.println("이쁘다");
		
		
	}

	@Override
	public String toString() {
		return "원더우먼 [pretty=" + pretty + ", height=" + height + ", name=" + name + ", age=" + age + "]";
	}
}
