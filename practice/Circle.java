package practice;

public class Circle extends Shape {
	private double xpos ;
	private double ypos ;
	private double radius ;
	
	public Circle(double xpos, double ypos, double radius) {
		this.xpos = xpos ;
		this.ypos = ypos ;
		this.radius = radius ;
	}
	
	public void showData() {
		System.out.println("원의 중심 : (" + this.xpos + ", " + this.ypos + ")");
		System.out.println("반지름 : " + this.radius);
		
		super.area = Math.PI * Math.pow(radius, 2.0) ;
		System.out.println("원의 면적 : " + super.area);
		
		super.perimeter = Math.PI * 2 * radius ;
		System.out.println("원의 둘레 : " + super.perimeter);
		
		
	}
}
