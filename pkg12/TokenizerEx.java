package pkg12;

import java.util.StringTokenizer;

public class TokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("한국 미국 일본");
		System.out.println( st.countTokens());
		
		while( st.hasMoreTokens() ) {
			String imsi = st.nextToken();
			System.out.println( imsi );
		}
		
		StringTokenizer st2 = new StringTokenizer("한국#미국#일본", "#");
		System.out.println( st2.countTokens());
		
		while( st2.hasMoreTokens() ) {
			String imsi = st2.nextToken();
			System.out.println( imsi );
		}
		System.out.println();
		StringTokenizer st3 = new StringTokenizer("한국#미국#일본", "#", true);
		System.out.println( st3.countTokens());
		
		while( st3.hasMoreTokens() ) {
			String imsi = st3.nextToken();
			System.out.println( imsi );
		}

	}

}
