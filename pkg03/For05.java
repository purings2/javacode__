package pkg03;
public class For05 {
	public static void main(String[] args) {
		int total = 0 ;
		
		for (int i = 1; i < 11; i++) {
			if (i%3 == 0 || i % 5 == 0) {
				total += i ;
			}
		}
		
		System.out.println(total);
	}
}