package pkg12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();

		set.add("ȫ�浿");
		set.add(123); // Integer�� �ڽ�, ������Ʈ�� ��ĳ����
		set.add(false); // Boolean���� �ڽ�, ������Ʈ�� ��ĳ����
		set.add("ȫ�浿");

		set.clear();

		set.add("ȫ�浿");
		set.add("������");
		set.add("��Ȳ");
		set.add("������");

		System.out.println(set.contains("�̼���"));
		System.out.println(set.contains("������"));

		if (!set.contains("������")) {
			set.add("������");
		}

		set.remove("��Ȳ");

		System.out.println(set.contains("������"));

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
 * �� �޼ҵ�� Ȯ��for�� ~~�޼ҵ��Դϴ�.
 * @param dataset objectŸ���� �������ִ� ~~~�Դϴ�.
 * 
 */
	private static void PrintFor(Set<Object> dataset) {
		System.out.println("Ȯ�� for ���");
		
		for(Object item : dataset) {
			System.out.println(item);
		}

	}

	private static void PrintSet(Set<Object> dataset) {
		System.out.println("Iterator �������̽� ���");

		Iterator<Object> it = dataset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
