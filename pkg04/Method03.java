package pkg04;
public class Method03 {
	static int func02(int x) {
		int a ;
		
		if ( x % 2 == 0) {
			a = 3*x ; 
		} else {
			a = x * x ;
		}
		
		return a ;
	}
	
	public static void main(String[] args) {
		int x = 2 ;
		int y = 1 ;
		
		int result = func01(x, y);
		System.out.println("결과01 : " + result);
		
		x = 1 ;
		y = 2 ;
		
		result = func01(x, y);
		System.out.println("결과02 : " + result);
		
		x = 10 ;
		result = func02(x) ;
		System.out.println("결과03 : " + result);
		
		for (int i = 3; i < 7; i++) {
			result = func02( i ) ;
			System.out.println( result);
		}
	}
	
	static int func01(int x, int y) {
		int aaa = 2*x + 3*y - 4 ;
		return aaa ;
	}
}




