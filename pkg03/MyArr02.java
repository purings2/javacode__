package pkg03;
public class MyArr02 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		for (int i = 0; i < a.length; i++) {
			System.out.println( a[i] ); 
		}
		
		System.out.println("------------------------");
		a = new int[3] ;
		for (int i = 0; i < a.length; i++) {
			a[i] = 10 * (i + 1 ) ; 
			System.out.println( a[i] ); 
		}
		
		System.out.println("------------------------");
		int[] b = new int[34] ;
		for (int i = 0; i < b.length; i++) {
			b[i] = 3 * i + 1 ;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
		
		System.out.println("------------------------");
		int[] c = new int[98/5+1] ;
		for (int i = 0; i < c.length; i++) {
			c[i] = 5 * i + 3 ;
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "]=" + c[i]);
		}
		
		System.out.println("------------------------");
		int[] d = new int[92/10+1] ;
		for (int i = 0; i < d.length; i++) {
			d[i] = -10 * i + 92 ;
		}
		
		for (int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "]=" + d[i]);
		}
	} 
}















