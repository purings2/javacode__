package pkg13;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList02 {
	public static void main(String[] args) {

		List<Person> lists = new ArrayList<Person>();

		Person per1 = new Person("김철수", 30, 40, 50);
		Person per2 = new Person("박영희", 70, 80, 90);
		Person per3 = new Person("홍길동", 40, 50, 60);

		lists.add(per1);
		lists.add(per2);
		lists.add(per3);

		System.out.println(lists.size());
		System.out.println();

		PrintList(lists); // 데이터 리스트 출력

		System.out.println();

		PrintFor(lists); // 이름과 총점 및 평균 출력

	}

	private static void PrintList(List<Person> lists) {
		System.out.println("데이터 리스트 출력");
		System.out.println("이름            국어           영어            수학");

//		Iterator<Person> it = abcd.iterator
//		for (Person item : lists) {
//			String name = item.getName();
//			int kor = item.getKor();
//			int eng = item.getEng();
//			int math = item.math;
//			System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math);
//
//		}

	}

	private static void PrintFor(List<Person> lists) {
		System.out.println("이름과 총점 및 평균 출력");

		for (Person item : lists) {
			String name = item.getName();
			int total = item.getTotal();
			double average = item.getAverage();

			System.out.println(name + "의 총점 : " + total + ", 평균 : " + average);
		}
	}

}
