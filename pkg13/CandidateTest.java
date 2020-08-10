package pkg13;

import java.util.ArrayList;
import java.util.List;

public class CandidateTest {
	public static void main(String[] args) {

		List<Candidate> lists = new ArrayList<Candidate>();

		Candidate can1 = new Candidate("������", "���ִ�", 0.4);
		Candidate can2 = new Candidate("ȫ��ǥ", "�ѱ���", 0.3);
		Candidate can3 = new Candidate("��ö��", "�����Ǵ�", 0.2);
		Candidate can4 = new Candidate("���¹�", "�ٸ� ����", 0.07);
		Candidate can5 = new Candidate("�ɻ���", "���Ǵ�", 0.03);

		lists.add(can1);
		lists.add(can2);
		lists.add(can3);
		lists.add(can4);
		lists.add(can5);

		System.out.println(lists.size());
		
		Display(lists);

	}

	private static void Display(List<Candidate> lists) {
		for (Candidate item : lists) {
			double rate = item.getRate();
			String name = item.getName();
			String dang = item.getDang();
			
			System.out.println(name + "\t" + dang + "\t" + rate);
		}
		
	}

}
