package pkg12;

import java.util.StringTokenizer;

public class TokenExam {
	public static void main(String[] args) {
		String str = "id=hong&password=1234&address=°ø´öµ¿" ;
		
		StringTokenizer st = new StringTokenizer(str, "&");
		
		StringTokenizer st2 ;
		
		while( st.hasMoreTokens()) {
			st2 = new StringTokenizer(st.nextToken(), "=") ;
			System.out.println(st2.nextToken());
			System.out.println(st2.nextToken());
			
			
			
			
		}
		
			

	}

}
