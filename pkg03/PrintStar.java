package pkg03;
public class PrintStar {
	public static void main(String[] args) {
		int star = 12 ;
		
		for (int i = 1; i <= star ; i++) {
			System.out.print("*");
			if( i % 5 == 0) {
				System.out.println();
			}
		}
	}
}