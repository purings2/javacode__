package pkg13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Object> lists = new ArrayList<Object>();

		lists.add("bigbang");
		lists.add("2ne1");
		lists.add("wonder");
		lists.add("kara");
		lists.add("2ne1");

		int idx = -1;
		idx = lists.indexOf("2ne1");
		System.out.println(idx);

		idx = lists.lastIndexOf("2ne1");
		System.out.println(idx);

		idx = lists.indexOf("girls");
		System.out.println(idx);

		lists.add(2, "girls");

		PrintFor(lists);

		lists.set(5, "2am");

		lists.remove("wonder");

		List<String> lists2 = new ArrayList<String>();
		
		lists2.add("aaa");
		lists2.add("eee");
		lists2.add("ddd");
		lists2.add("bbb");
		lists2.add("ccc");
		
		System.out.println("오름차순 정렬");
		Collections.sort(lists2);
		System.out.println(lists2);
		
		System.out.println("내림차순 정렬");
		Collections.sort(lists2, Collections.reverseOrder());
		System.out.println(lists2);
		
		System.out.println("무작위 섞기");
		Collections.shuffle(lists2);
		System.out.println(lists2);

		PrintGet(lists);
		
		PrintList(lists);

		List<Object> newlists = lists.subList(2, 4);
		System.out.println(newlists);
		
		List<Object> first = lists.subList(1, 3);
		List<Object> second = lists.subList(4, 5);
		
		List<Object> newSub = new ArrayList<Object>();
		
		newSub.addAll(first);
		newSub.addAll(second);
		
		System.out.println(newSub);
		
		
		
		System.out.println("요소 갯수 : " + lists.size());
		System.out.println(lists);

	}

	private static void PrintList(List<Object> lists) {
		System.out.println("iterator 인터페이스 사용하기");
		Iterator<Object> it = lists.iterator() ;
		
		while(it.hasNext()) {
			String item = (String) it.next();
			System.out.println(item);
		}
		
	}

	private static void PrintGet(List<Object> lists) {
		System.out.println("get 메소드 사용해보기");
		for (int i = 0; i < lists.size(); i++) {
			String item = (String) lists.get(i);
			System.out.println(item);
		}

	}

	private static void PrintFor(List<Object> lists) {
		System.out.println("확장 for를 사용해보기");
		for (Object item : lists) {
			System.out.println(item);
		}

	}

}
