package pkg12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lotto {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		Random random = new Random();
		
		int secondno = 0 ;
		
		while(lotto.size() < 7) {
			int su = random.nextInt(45) +1 ;
			
		 if ( lotto.size() == 6) {
			secondno = su ;
		}
		lotto.add(su) ;
		}
		lotto.remove(secondno) ;
		
		Object[] obj = lotto.toArray();
		Arrays.sort(obj);
		
		System.out.println("금주의 1등 번호");
		for(Object num : obj) {
			System.out.print(num.toString() + "\t");
		}
		System.out.println();
		System.out.println();
		System.out.println("2등 번호 : " + secondno);
		
		

	}
}