package pkg02;

public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println( 3 >= 2) ;
		System.out.println( -1 < 0 );
		System.out.println( 3.45 <= 2);
		System.out.println( 3 == 2);		
		System.out.println( 3 != 2);
		
		System.out.println('a' < 'b');
		
		System.out.println((3>2) && (3>4)); //false
		
		System.out.println( !(3 != 2) ); //false
		
		int x = 3, y = 2 ;
		System.out.println(  (x != y) || ( -1 > 0 ) ); //true
		
		
	}
}











