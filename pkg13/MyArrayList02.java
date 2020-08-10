package pkg13;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList02 {
	public static void main(String[] args) {

		List<Person> lists = new ArrayList<Person>();

		Person per1 = new Person("��ö��", 30, 40, 50);
		Person per2 = new Person("�ڿ���", 70, 80, 90);
		Person per3 = new Person("ȫ�浿", 40, 50, 60);

		lists.add(per1);
		lists.add(per2);
		lists.add(per3);

		System.out.println(lists.size());
		System.out.println();

		PrintList(lists); // ������ ����Ʈ ���

		System.out.println();

		PrintFor(lists); // �̸��� ���� �� ��� ���

	}

	private static void PrintList(List<Person> lists) {
		System.out.println("������ ����Ʈ ���");
		System.out.println("�̸�            ����           ����            ����");

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
		System.out.println("�̸��� ���� �� ��� ���");

		for (Person item : lists) {
			String name = item.getName();
			int total = item.getTotal();
			double average = item.getAverage();

			System.out.println(name + "�� ���� : " + total + ", ��� : " + average);
		}
	}

}
