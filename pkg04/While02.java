package pkg04;
import java.util.Scanner ;

public class While02 {
	public static void main(String[] args) {
		int total = 0; //����

		Scanner scan = new Scanner(System.in) ;
		
		while(true){
			System.out.println("���� �Է� : ");
			int su = scan.nextInt() ;
			
			if(su <= 0) {
				break ;
			}
			
			total += su ;			
		}
		System.out.println( total );
		
	}
}