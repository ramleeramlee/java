package 상속기본;

public class 볼펜 extends 학용품{
	double 두께;
	
	public void 글을쓰다() {
		System.out.println("얇을 수록 인기 많다");
	}

	@Override
	public String toString() {
		return "볼펜 [두께=" + 두께 + ", money=" + money + ", company=" + company + "]";
	}
	
	

}
