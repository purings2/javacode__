package pkg11;

import java.util.Scanner;

public class JumsuMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// int kor = 100, eng = 100, math = 20; // 케이스 1
		// int kor = 50, eng = 50, math = 50 ; //케이스 2
		// int kor = 50, eng = 50, math = 100 ; //케이스 3
		try {
			System.out.println("학생 이름은?");
			String name = scan.next();
			System.out.println("국어 점수는?");
			int kor = scan.nextInt();
			System.out.println("영어 점수는?");
			int eng = scan.nextInt();
			System.out.println("수학 점수는?");
			int math = scan.nextInt();

			int total = kor + eng + math;

			if (kor <= 40 || eng <= 40 || math <= 40) {
				String message = "☆개별 과목점수가 40점을 넘지 못하여 탈락입니다.☆";
				throw new MinJumsuException(message);
			}
			if (total < 180) {
				String message = "☆평균 60점 미만이므로 탈락입니다.☆";
				throw new FailedException(message);
			}

			// 여기서 평균과 총점을 출력하면 된다.
			System.out.println("응시자 : " + name);
			double average = (double) total / 3.0;
			System.out.println("총점 : " + total);
			System.out.printf("평균 : %.2f\n", average);

		} catch (MinJumsuException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (FailedException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();

		} 

	}

}
