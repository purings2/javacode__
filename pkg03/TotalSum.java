package pkg03;
public class TotalSum {
	public static void main(String[] args) {
		double total = 0.0 ; 
		
		for (int i = 1; i < 101; i++) {
			total += (double)1/i ;
		}
		
		System.out.println("����01 : "+ total);
		
		total = 0.0 ; 
		
		for (int i = 1; i < 101; i++) {
			total += (double)(i-1)/i ;
		}
		
		System.out.println("����02 : "+ total);
		
		total = 0.0 ; 
		
		for (int i = 1; i < 101; i++) {
			if (i%2 == 0) {
				total -= (double)1/i ;
			} else {
				total += (double)1/i ;
			}
		}
		
		System.out.println("����03 : "+ total);
		
		total = 0.0 ; 
		
		for (int i = 1; i < 101; i++) {			
			total += i%2 == 0 ? -(double)1/i : +(double)1/i ;			
		}
		
		System.out.println("����04 : "+ total); 
	}
}



