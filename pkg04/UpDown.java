package pkg04;

import java.util.Random;
import java.util.Scanner;
public class UpDown {
	public static void main(String[] args) {
		//random : 랜덤 객체
		Random random = new Random();
		
		//answer: 컴퓨터가 기억한 숫자
		int answer = random.nextInt(100) + 1 ;
		System.out.println(answer);
		
		Scanner scan = new Scanner(System.in) ;
		
		while(true) {
			System.out.println("숫자 입력");
			int su = scan.nextInt() ;
			//System.out.println( su );
			
			if ( answer > su) {
				System.out.println("up");
				
			}else if ( answer < su) {
				System.out.println("down");
				
			} else {
				System.out.println("정답입니다.");
				break ;
			}
		} 
	}
}







