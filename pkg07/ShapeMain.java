package pkg07;
public class ShapeMain {
	public static void main(String[] args) {
		Circle circle = new Circle(3.0, 4.0, 10.0);		
		circle.showData();
		
		Rectangle rect = new Rectangle(10.0, 10.0) ;
		rect.showData();
		
		Triangle tri = new Triangle(10.0, 10.0) ;
		tri.showData();
	}
}