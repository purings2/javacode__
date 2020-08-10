package pkg02;

public class Arithmetic01 {
	public static void main(String[] args) {
		int x = 14, y = 5, z ;
		
		z = x + y ;
		System.out.println("더하기 : " + z ) ;

		z = x - y ;
		System.out.println("빼기 : " + z ) ;
		
		z = x * y ;
		System.out.println("곱하기 : " + z ) ;
		
		z = x / y ; //정수 나누기 정수는 정수이다.
		System.out.println("나누기 : " + z ) ;
		
		z = x % y ;
		System.out.println("나머지 : " + z ) ;

	}

}
