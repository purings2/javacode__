package pkg04;
public class Method04 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		
		int result = func03( a ) ;
		System.out.println("합산 : " + result);
		
		int[] b = {1, 2, 3, 4};	
		result = func04( b ) ;
		System.out.println("합산 : " + result);
	}
	
	static int func04(int[] x){
		int total = 0 ;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				total += x[i] * x[i] ;
			} else {
				total += 3 * x[i] ;
			}
		}
		return total ;
	}
	
	
	static int func03(int[] x){
		int total = 0 ;
		for (int i = 0; i < x.length; i++) {
			 total += x[i] ;
		}
		return total;
	}
}