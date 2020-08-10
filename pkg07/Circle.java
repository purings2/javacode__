package pkg07;

public class Circle extends Shape{
	private double xpos ; 
	private double ypos ;
	private double radius ;
	
	public Circle(double xpos, double ypos, double radius) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
	}

	public void showData() {
		super.area = Math.PI * Math.pow(radius, 2.0) ;
		super.perimeter = 2.0 * Math.PI * radius ;
		
		System.out.println("���� �߽� (" + xpos + "," + ypos + ")");
		System.out.println("������ : " + radius);
		System.out.println("���� : " + super.area);
		System.out.println("�ѷ� : " + super.perimeter);
	}	
}








