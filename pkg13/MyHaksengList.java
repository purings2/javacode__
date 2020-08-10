package pkg13;

import java.util.ArrayList;
import java.util.List;

public class MyHaksengList {

	public static void main(String[] args) {
		
		
		List<Hakseng> lists = new ArrayList<Hakseng>();
		
		lists.add(new Hakseng("��ö��", 1, 3, 30, 40, 50));
		lists.add(new Hakseng("�ڿ���", 1, 4, 70 ,80, 90));
		lists.add(new Hakseng("ȫ�浿", 1, 5, 40, 50, 60));
		
		System.out.println("�̸�\t�г�\t��\t����\t����\t����\t����\t���");
		Display(lists);
	}

	private static void Display(List<Hakseng> lists) {

		for (Hakseng hakseng : lists) {
			String name = hakseng.getName();
			int no = hakseng.getNo();
			int ban = hakseng.getBan();
			int kor = hakseng.getKor();
			int eng = hakseng.getEng();
			int math = hakseng.getMath();
			
			int total = kor + eng + math ;
			double average = total / 3.0 ;			
			
			String imsi = "";
			imsi += name + "\t" + no + "\t" + ban + "\t";
			imsi += kor + "\t" + eng + "\t" + math + "\t";
			imsi += total + "\t" + average ;
			System.out.println(imsi);
		}
		
	}

}
