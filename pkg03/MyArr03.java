package pkg03;
public class MyArr03 {
	public static void main(String[] args) {
		int cntodd = 0 ;
		int cnteven = 0 ;
		
		int[] arr = {15, 20, 10, 30, 35} ;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnteven+=1;	
			} else {
				cntodd+=1;
			}
		}
		System.out.println("Ȧ�� ���� :" + cntodd);
		System.out.println("¦�� ���� :" + cnteven);
		
		int max = -99999 ;
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i]) {
				max = arr[i] ;
			}
		}
		System.out.println("�ִ� �� :" + max);
		
		int min = +99999 ;
		for (int i = 0; i < arr.length; i++) {
			if ( min > arr[i]) {
				min = arr[i] ;
			}
		}
		System.out.println("�ּ� �� :" + min);
		
		int abs = arr[cntodd] - arr[cnteven] ;
		if(abs <0 ) {
			abs = -abs ;
		}
		System.out.println("���밪 :" + abs);
	}
}






