package pkg12;

import java.util.HashSet;
import java.util.Set;

public class MakeSet {
	public static void main(String[] args) {

		Set<Integer> even = new HashSet<Integer>();
		Set<Integer> three = new HashSet<Integer>();

		for (int i = 1; i < 11; i++) {

			if (i % 2 == 0) {
				even.add(i);
			}
			
			if (i % 3 == 0) {
				three.add(i);
			} 

		}
		
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(even);
		union.addAll(three);
		System.out.println(union);

		Set<Integer> intersection = new HashSet<Integer>(even);
		intersection.retainAll(three);
		System.out.println(intersection);

		Set<Integer> difference = new HashSet<Integer>(even);
		difference.removeAll(three);
		System.out.println(difference);

	}
}