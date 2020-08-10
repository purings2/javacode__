package pkg11;

import java.util.Scanner;

public class JumsuMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// int kor = 100, eng = 100, math = 20; // ���̽� 1
		// int kor = 50, eng = 50, math = 50 ; //���̽� 2
		// int kor = 50, eng = 50, math = 100 ; //���̽� 3
		try {
			System.out.println("�л� �̸���?");
			String name = scan.next();
			System.out.println("���� ������?");
			int kor = scan.nextInt();
			System.out.println("���� ������?");
			int eng = scan.nextInt();
			System.out.println("���� ������?");
			int math = scan.nextInt();

			int total = kor + eng + math;

			if (kor <= 40 || eng <= 40 || math <= 40) {
				String message = "�ٰ��� ���������� 40���� ���� ���Ͽ� Ż���Դϴ�.��";
				throw new MinJumsuException(message);
			}
			if (total < 180) {
				String message = "����� 60�� �̸��̹Ƿ� Ż���Դϴ�.��";
				throw new FailedException(message);
			}

			// ���⼭ ��հ� ������ ����ϸ� �ȴ�.
			System.out.println("������ : " + name);
			double average = (double) total / 3.0;
			System.out.println("���� : " + total);
			System.out.printf("��� : %.2f\n", average);

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
