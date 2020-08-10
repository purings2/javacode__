package pkg02;

public class PlusMinus01 {
	public static void main(String[] args) {
		int a = 10, b = 20, c ;
		
		c = ++a + b++ ;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		c = a++ + --b ;
		  
		System.out.println("a : " + a);//12
		System.out.println("b : " + b);//20
		System.out.println("c : " + c);//31
		
		a = 15 ;
		b = 12 ;
		c += --a + --b ;
		
		System.out.println("a : " + a); // 14
		System.out.println("b : " + b); // 11
		System.out.println("c : " + c); // 25
	}
}



