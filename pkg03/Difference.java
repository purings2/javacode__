package pkg03;
public class Difference {
	public static void main(String[] args) {
		int sumA = 0 , sumB = 0 ; 
		
		for (int i = 1; i < 51; i++) {
			if (i%3 == 0) {
				sumB += i ;
			} else {
				sumA += i ;
			} 
		}
		
		System.out.println("°á°ú :" + (sumA - sumB));
	}
}