package pkg13;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyTokenList {
	public static void main(String[] args) {
		String str = "MBC KBS SBS" ;
		
		StringTokenizer st = new StringTokenizer(str);
		
		String[] arr = new String[st.countTokens()];
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			arr[cnt++] = st.nextToken() ;
		}
		
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = st.nextToken();
//		}
		
		List<String> lists = new ArrayList<String>();
		
		for (int i = 0; i < arr.length; i++) {
			lists.add(arr[i]);
		}
				
		System.out.println(lists);
		
		System.out.println();
		
		for (String item : lists) {
			System.out.println(item);
		}
		
		
	}

}
