package pkg13;

import java.util.ArrayList;
import java.util.List;

public class CandidateTest {
	public static void main(String[] args) {

		List<Candidate> lists = new ArrayList<Candidate>();

		Candidate can1 = new Candidate("문재인", "민주당", 0.4);
		Candidate can2 = new Candidate("홍준표", "한국당", 0.3);
		Candidate can3 = new Candidate("안철수", "국민의당", 0.2);
		Candidate can4 = new Candidate("유승민", "바른 정당", 0.07);
		Candidate can5 = new Candidate("심상정", "정의당", 0.03);

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
