package pkg11;

import java.util.Scanner;

public class ExcepTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("ù ��° ���� �Է� : ");
			int x = scan.nextInt();

			System.out.println("�� ��° ���� �Է� : ");
			int y = Integer.parseInt(scan.next());
			System.out.println(x / y);

		} catch (NumberFormatException e) {	
			System.out.println("���ڸ� �Է����ּž� �˴ϴ�..");

		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻�.");

		} catch (Exception e) {
			System.out.println("������ ���� �׸� �߻�");

		} finally {
			System.out.println("��ĳ�ʸ� �����մϴ�..");
			scan.close();
		}

	}

}
