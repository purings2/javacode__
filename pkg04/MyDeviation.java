package pkg04;
public class MyDeviation {
	public static void main(String[] args) {		
		int[] arr = {10, 30, 40, 80} ;
		double result = deviation(arr) ;
		System.out.println( "��� : " + result );		
	}
	
	static double deviation( int[] arr ){
		int total = 0 ; //������ �����ִ� ����
		for (int i = 0; i < arr.length; i++) {
			total += arr[i] ; //�迭 ����� ������ ���Ѵ�.
		}
		double average = (double)total / arr.length ;
		
		double imsi = 0.0 ;
		for (int i = 0; i < arr.length; i++) {
			imsi += (average-arr[i]) * (average-arr[i]);
		}
		
		imsi /= arr.length ;
		
		return Math.sqrt(imsi) ;
	}

//	double x = 4.0 ;
//	System.out.println( Math.sqrt(x)  );
//	
//	x = 9.0 ;
//	double aaa = Math.sqrt(x) ;
//	System.out.println(aaa );
//	
//	x = -12.0 ;
//	System.out.println( Math.abs(x));
}
