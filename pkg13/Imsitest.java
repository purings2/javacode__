package pkg13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Imsitest {

	public static void main(String[] args) {
//		SimpleDateFormat
		String pattern = "###,###.00" ;
		DecimalFormat df = new DecimalFormat(pattern) ;
		
		double su = 12345.6789 ;
		String result = df.format(su) ;
		
		System.out.println( result );
		
		String[] banchan = {"¸êÄ¡", "°¨ÀÚ"};
		System.out.println(Arrays.toString(banchan));
	}

}
