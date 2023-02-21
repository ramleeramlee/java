package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; //1바이트, -128~127까지 가능
		int i1 = 200; //4바이트, -21억~21억
		
		i1 = b1; // 작은수를 큰수에 넣은거라 사용가능 (자동형변환)
		
		b1 = (byte)i1; // 큰수를 작은수에 넣으려면 강제로 잘라야함(강제형변환)
		
		//double(큰) <- int(작)
		double d1 = i1; // 자동형변환
		i1 = (int)d1; // 강제형변환
		
		int i2 = 2000;
		byte b2 = (byte)i2; //byte의 범위를 넘어선 127이상의 숫자는 강제형변환하지 말아야 함!!
		

	}

}
