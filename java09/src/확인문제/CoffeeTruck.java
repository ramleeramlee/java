package 확인문제;

public class CoffeeTruck extends Truck{
	boolean food;
	
	public void place() {
		System.out.println("대학교 앞");
		
	}

	@Override
	public String toString() {
		return "CoffeeTruck [food=" + food + ", color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
