package pkg07;

public class Rectangle  extends Shape{
	private double width ; 
	private double height ;
	
	public Rectangle(double width, double height) {
		this.width = width ;
		this.height = height ;
	}

	public void showData() {
		super.area = width * height ;
		super.perimeter = 2.0 * (width + height) ; 
		
		System.out.println("면적 : " + super.area);
		System.out.println("둘레 : " + super.perimeter);
	}	
}