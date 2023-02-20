package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 중복제거 ==> set
		HashSet list = new HashSet();
		
		list.add("오사카");
		list.add("캐나다");
		list.add("오키나와");
		list.add("스위스");
		list.add("대만");
		
		System.out.println(list);
		list.add("오사카");
		System.out.println(list);
	
		//키 + 값으로 쌍으로 넣을 때 ==>map
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		
		System.out.println(room);
		System.out.println(room.get("현관"));
		room.replace("거실", "책상"); // room.put("거실", "책상"); 와 같다
		System.out.println(room);
		
		//할 일 우선순위(순서) ==> list
		ArrayList todo = new ArrayList();
		
		todo.add("1");
		todo.add("2");
		todo.add("3");
		todo.add("4");
		todo.add("5");
		
		System.out.println(todo);
		System.out.println(todo.get(0));
		System.out.println(todo.get(todo.size()-1));
		todo.set(1, "청소");
		System.out.println(todo);
		

	}

}
