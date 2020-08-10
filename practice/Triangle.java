package practice;

public class Triangle extends Shape {
	private double width ;
	private double height ;

	public Triangle(double width, double height) {
		this.width = width ;
		this.height = height ;
	}
	
	public void showData() {
		super.area = (this.width * this.height) / 2 ;
		System.out.println("삼각형의 면적 : " + super.area);
		
		double diag = (Math.pow(width, 2.0) + Math.pow(height, 2.0)) ;
		super.perimeter = Math.sqrt(diag) + width + height ;
		System.out.println("삼각형의 둘레 : " + super.perimeter);
	}
}

