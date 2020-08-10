package pkg12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();

		set.add("홍길동");
		set.add(123); // Integer로 박싱, 오브젝트로 업캐스팅
		set.add(false); // Boolean으로 박싱, 오브젝트로 업캐스팅
		set.add("홍길동");

		set.clear();

		set.add("홍길동");
		set.add("강감찬");
		set.add("이황");
		set.add("윤봉길");

		System.out.println(set.contains("이순신"));
		System.out.println(set.contains("김유신"));

		if (!set.contains("김유신")) {
			set.add("김유신");
		}

		set.remove("이황");

		System.out.println(set.contains("김유신"));

		System.out.println(set.size());
		System.out.println(set);

		PrintSet(set);
		PrintFor(set);
		
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setB.add(6);
		
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(setA) ;
		union.addAll(setB) ;
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println(intersection);
		
		Set<Integer> intersection2 = new HashSet<Integer>(setA);
		intersection2.removeAll(setB);
		System.out.println(intersection2);
		
		
		
		
	}
/**
 * 이 메소드는 확장for를 ~~메소드입니다.
 * @param dataset object타입을 가지고있는 ~~~입니다.
 * 
 */
	private static void PrintFor(Set<Object> dataset) {
		System.out.println("확장 for 사용");
		
		for(Object item : dataset) {
			System.out.println(item);
		}

	}

	private static void PrintSet(Set<Object> dataset) {
		System.out.println("Iterator 인터페이스 사용");

		Iterator<Object> it = dataset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
