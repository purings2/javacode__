package pkg03;
public class While01 {
	public static void main(String[] args) {
		int i = 1 ;
		int total = 0 ;
		while( i < 11 ){
			total += i ;
			i++ ;
		}
		
		System.out.println("총합01 : " + total);
		
		// 1 + 4 + 7 + ... +100 = 1717
		total = 0 ;
		i = 1 ;
		while( i < 101 ){
			total += i ;
			i += 3 ;
		}
		
		System.out.println("총합02 : " + total);
		
		// 1*1 + 6*6 + ... + 96*96 = 63670
		total = 0 ;
		i = 1 ;
		while( i < 97 ){
			total += i*i ;
			i += 5 ;
		}
		
		System.out.println("총합02 : " + total);
		
		
		// 3단을 while 구문으로 풀어 보세요.
		int dan = 3 ;
		i = 1 ;
		
		while( i < 10 ){
			System.out.println( dan + "*" + i + "=" + (dan*i) );
			i++ ;
		}
	}
}












