package pkg02;

public class Casting {
	public static void main(String[] args) {
		int i = (int)3.14 ; //����� ����ȯ
		
		System.out.println("i : " + i);
		
		double d = 100 ; //�Ͻ��� ����ȯ
		System.out.println("d : " + d);
		
		System.out.println(14/5);
		System.out.println((double)14/5);
		System.out.println((double)(14/5));
		
		int kor = 50, eng = 60, math = 80 ;
		int total = kor + eng + math ;
		double average = (double)total / 3 ;
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		
		char ch1 = 'c' ;
		char ch2 = 'd' ;
		
		boolean bool = ch1 > ch2 ;
		System.out.println( bool );
		
		int result = ch1 - ch2 + 3 ; 
		System.out.println(result);
	}
}







