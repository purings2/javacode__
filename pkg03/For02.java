package pkg03;
public class For02 {
	public static void main(String[] args) {
		int odd = 0, even = 0 ;
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				even += i ;
			} else {
				odd += i ;
			}
		}
		
		System.out.println("È¦¼öÀÇ ÃÑÇÕ : " + odd);
		System.out.println("Â¦¼öÀÇ ÃÑÇÕ : " + even);
	}
}