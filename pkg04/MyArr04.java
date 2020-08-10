package pkg04;
public class MyArr04 {
	public static void main(String[] args) {
		int x = 3 ;
		int[][] arr = new int[2][3] ;
		
		arr[1][1] = 3 ;
		arr[0][1] = arr[1][1] + 2 - x ;
		
		arr[0][0] = 5 ;
		arr[0][2] = 4 ;
		arr[1][0] = 7 ;
		arr[1][2] = 8 ;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]); 
			}
			System.out.println();
		}
		
		int[][] b = {{10, 20, 30}, {40, 50}} ;
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("b[" + i + "][" + j + "] = " + b[i][j]); 
			}
			System.out.println();
		}
		
	}
}










