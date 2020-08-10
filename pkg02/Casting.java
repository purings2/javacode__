package pkg02;

public class Casting {
	public static void main(String[] args) {
		int i = (int)3.14 ; //명시적 형변환
		
		System.out.println("i : " + i);
		
		double d = 100 ; //암시적 형변환
		System.out.println("d : " + d);
		
		System.out.println(14/5);
		System.out.println((double)14/5);
		System.out.println((double)(14/5));
		
		int kor = 50, eng = 60, math = 80 ;
		int total = kor + eng + math ;
		double average = (double)total / 3 ;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		char ch1 = 'c' ;
		char ch2 = 'd' ;
		
		boolean bool = ch1 > ch2 ;
		System.out.println( bool );
		
		int result = ch1 - ch2 + 3 ; 
		System.out.println(result);
	}
}







