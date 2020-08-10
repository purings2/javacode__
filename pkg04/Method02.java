package pkg04;

public class Method02 {
	static double avg(double m, double n) {
		double aaa = ( m + n ) / 2.0 ;
		return aaa ;
	}
	
	public static void main(String[] args) {
		double x = 3.0 ;
		double y = 5.0 ;
		
		double result = avg(x, y) ;
		System.out.println("°á°ú01 : " + result);
		
		x = 4.0 ;
		y = 6.0 ;
		
		result = avg(x, y) ;
		System.out.println("Æò±Õ02 : " + result );
	}
	
	
}