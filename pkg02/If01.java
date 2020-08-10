package pkg02;

public class If01 {

	public static void main(String[] args) {
		int su = 9 ;
		
		//su가 홀수이면 출력하세요.
		if( su % 2 == 1 ) {
			System.out.println("홀수 : " + su);
		}

		//홀짝수 판단하여 출력 하세요.
		if( su % 2 == 1 ) {
			System.out.println("홀수 : " + su);
		}else {
			System.out.println("짝수 : " + su);
		}
		
		//su가 3의 배수이면 "yes"를 아니면, "no"를 출력하기
		if( su % 3 == 0 ) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		int jumsu = 65 ;
		//60점 이상이면 합격입니다. 합격 결과를 출력하세요.
		if( jumsu >= 60 ) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		jumsu = 75 ; 
		
		if ( jumsu >= 90 ) {
			System.out.println("A 학점"); 
			
		} else if ( jumsu >= 80 ) {
			System.out.println("B 학점");
			
		} else if ( jumsu >= 70 ) {
			System.out.println("C 학점");
			
		} else if ( jumsu >= 60 ) {
			System.out.println("D 학점");
			
		} else {
			System.out.println("F 학점"); 
		}
		
		
		
		
		
		
		
		int month = 7 ;
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
			
		} else if (month >= 6 && month <= 8 ) {
			System.out.println("여름");
			
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
			
		} else {
			System.out.println("겨울");
		}
		
	}

}









