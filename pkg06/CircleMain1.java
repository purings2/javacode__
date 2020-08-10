package pkg06;
public class CircleMain1 {
	public static void main(String[] args) {
		Circle1 circle1 = new Circle1(3.0, 4.0, 10.0);
		Circle1 circle2 = new Circle1(8.0, 6.0, 20.0);
		
		System.out.println(circle1.getStatus());
		System.out.println(circle2.getStatus());
			
		
		circle1.showData();
		circle2.showData();
		
	
	}
}