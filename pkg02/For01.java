package pkg02;

public class For01 {
	public static void main(String[] args) {
		int total = 0;
		
		for( int i = 1 ; i < 11 ; i++ ) {			
			total += i ;			
		}		
		System.out.println("รัวี01 : " + total );
		
		total = 0 ; 
		// 1 + 3 + 5 + 7 + 9  
		for( int i = 1 ; i < 10 ; i+=2 ) {			
			total += i ; //total =  total + i ;			
		}		
		System.out.println("รัวี02 : " + total );
		
		
		// 1 + 4 + 7 + ... + 100 = 1717
		total = 0 ; 
		
		for( int i = 1 ; i < 101 ; i+=3 ) {			
			total += i ;			
		}		
		System.out.println("รัวี03 : " + total );
		
		// 97 + 92 +87 + ... + 7 + 2 = 990
		total = 0 ; 
		
		for( int i = 97 ; i > 1 ; i-=5 ) {			
			total += i ;			
		}		
		System.out.println("รัวี04 : " + total );
	}
}












