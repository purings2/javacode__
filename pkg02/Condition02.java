package pkg02;

public class Condition02 {

	public static void main(String[] args) {
		int x = 3, y = 2 ;
		int result = x > y ? 5 : 3 ;
		
		System.out.println("���01 : " + result);
		
		x = 8 ;
		y = 4 ;
		
		result = x > y ? x : y  ;
		
		System.out.println("���02 : " + result);
		
		x = 5 ;
		y = 12 ;

		//x�� y�� ����̸� 'yes', �ƴϸ� 'no'�� ����ϼ���.
		String str = y % x == 0 ? "yes" : "no" ; 
		System.out.println("���03 : " + str);
		
		//x�� ¦���̸� 2��, �ƴϸ� ���� ���� ����ϼ���.
		result = x % 2 == 0 ? 2 * x : x * x  ; 
		
		System.out.println("���04 : " + result);
		
	}

}








