package 상속기본;

public class FlyCar extends Car{
	boolean fly;
	
	public void fly() {
		System.out.println("하늘 나는 자동차");
	}

	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", color=" + color + "]";
	}



}
