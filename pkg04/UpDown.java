package pkg04;

import java.util.Random;
import java.util.Scanner;
public class UpDown {
	public static void main(String[] args) {
		//random : ���� ��ü
		Random random = new Random();
		
		//answer: ��ǻ�Ͱ� ����� ����
		int answer = random.nextInt(100) + 1 ;
		System.out.println(answer);
		
		Scanner scan = new Scanner(System.in) ;
		
		while(true) {
			System.out.println("���� �Է�");
			int su = scan.nextInt() ;
			//System.out.println( su );
			
			if ( answer > su) {
				System.out.println("up");
				
			}else if ( answer < su) {
				System.out.println("down");
				
			} else {
				System.out.println("�����Դϴ�.");
				break ;
			}
		} 
	}
}







