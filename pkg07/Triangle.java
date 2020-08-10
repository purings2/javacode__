package pkg07;

public class Triangle  extends Shape{
	private double width ; 
	private double height ;
	
	public Triangle(double width, double height) {
		this.width = width ;
		this.height = height ;
	}

	public void showData() {
		super.area = width * height / 2.0 ;
		
		//대각선의 길이
		double diag = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0)) ;
		super.perimeter = width + height + diag ; 
		
		System.out.println("면적 : " + super.area);
		System.out.println("둘레 : " + super.perimeter);
	}

}
