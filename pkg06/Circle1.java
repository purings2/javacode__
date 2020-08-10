package pkg06;

public class Circle1 {
	private double xpos ; //x 좌표
	private double ypos ; //y 좌표
	private double radius ; //반지름
	private double area ; // 면적은 클래스 외부에서 입력 할 필요가 없다.
	private double perimeter ; //둘레
	private String status ; //대형, 소형
	
	public Circle1(double xpos, double ypos, double radius) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
		
		//this.area = Math.PI * this.radius * this.radius ;
		this.area = Math.PI * Math.pow(this.radius, 2.0) ;
	}
		
	public String getStatus() {
		if(this.area >= 500) {
			this.status = "대형" ;
		} else {
			this.status = "소형" ;
		}
		return "상태 : " + status;
	}

	void showData() {
		System.out.println("원의 중심 : (" + this.xpos + ", " + this.ypos + ")");
		System.out.println("반지름 : " + this.radius);
		
		
		System.out.printf("면적 : %8.3f\n", this.area);
		
		this.perimeter = 2.0 * Math.PI * this.radius ;
		System.out.printf("둘레 : %8.3f\n", this.perimeter);
	}
}






