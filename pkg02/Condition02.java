package pkg02;

public class Condition02 {

	public static void main(String[] args) {
		int x = 3, y = 2 ;
		int result = x > y ? 5 : 3 ;
		
		System.out.println("결과01 : " + result);
		
		x = 8 ;
		y = 4 ;
		
		result = x > y ? x : y  ;
		
		System.out.println("결과02 : " + result);
		
		x = 5 ;
		y = 12 ;

		//x가 y의 약수이면 'yes', 아니면 'no'로 출력하세요.
		String str = y % x == 0 ? "yes" : "no" ; 
		System.out.println("결과03 : " + str);
		
		//x가 짝수이면 2배, 아니면 제곱 값을 출력하세요.
		result = x % 2 == 0 ? 2 * x : x * x  ; 
		
		System.out.println("결과04 : " + result);
		
	}

}








