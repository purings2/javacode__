package pkg03;
public class MyArr01 {
	public static void main(String[] args) {
		int x = 3; 
		int y = 5;
		
		int[] arr = new int[4] ;
		
		arr[0] = x - y + 6 ;
		arr[2] = arr[0] + 3 ;
		arr[1] = arr[0] + arr[2];
		arr[3] = x + arr[0] - 4  ;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]  ); 
		}
		
		String[] apink = {"하하", "호호", "히히"};
		
		for (int i = 0; i < apink.length; i++) {
			System.out.println("apink[" + i + "] = " + apink[i]  ); 
		}
	}
}