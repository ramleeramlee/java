package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2(); //불러오면 끝 (불꺼와 같은 기능) 리턴이 없기 때문에 프린트 불가!!
		
		int result1 = re.add(200, 100);
		System.out.println("더한 값은 " + result1);
		
		double result2 = re.add(22.1, 10); // 더블이 무조건 앞에!! 순서 지켜서 적어야 한다
		System.out.println("더한 값은 " + result2);
		
		String result3 = re.add("나는", "천재");
		System.out.println("더한 값은 " + result3);
		
		String result4 = re.add(1, "번 천재");
		System.out.println("더한 값은 " + result4);
		
		int[] result5 = re.add(); //{1,2,3}
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 =re.getDate();
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		System.out.println(result6.getDay()); //요일은 일요일 부터 0
		
		int result7 = re.getHour();
		System.out.println(result7 + "시 수업중");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤한 정수는 " + result8);
		
		ArrayList result9 = re.getList();
		System.out.println(result9.get(0));
		System.out.println(result9.get(0) + " " + result9.get(1));
		result9.set(0, "양파"); //0번 인덱스의 값을 양파로 바꾼다
		System.out.println(result9);
		
		HashSet result10 = re.getSet(); //중복 걸러준다
		System.out.println(result10);
		
		
		
		
		
		
		
	}

}
