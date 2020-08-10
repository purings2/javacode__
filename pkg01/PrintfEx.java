package pkg01;
public class PrintfEx {
	public static void main(String[] args) {
		int i = 65 ;
		char ch = 'a' ;
		double d = 12.3456789 ;
		int age = 35 ;
		String name = "홍길동" ;
		
		System.out.println("정수 : [" + i + "]") ;
		System.out.println("문자 : [" + ch + "]") ;
				
		System.out.printf("정수1 : [%d], 정수2 : [%3d], 정수3 : [%-3d]\n", i, i, i) ;
		
		System.out.printf("실수1 : [%f]\n", d) ;
		System.out.printf("실수2 : [%6.2f]\n", d) ;
		System.out.printf("실수3 : [%.3f]\n", d) ;
		
		System.out.printf("정수를 문자로 변환 : [%c]\n", (char)i) ;
		System.out.printf("문자를 정수로 변환 : [%d]\n", (int)ch) ;
		
		System.out.printf("이름 : [%s]\n", name) ;
	}
}