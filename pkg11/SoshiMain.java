package pkg11;

import java.util.Scanner;

public class SoshiMain {
	public static void main(String[] args) {
		String[] soshi = { "����", "����", "���" };

		Scanner scan = new Scanner(System.in);

		System.out.println("�̸� �Է� : ");

		String name = scan.next();

		// ��������� �Ǵ��ϴ� ����
		// false�� ����� �ƴ϶�� �����մϴ�.
		boolean isMember = false;

		for (int i = 0; i < soshi.length; i++) {
			if (name.equals(soshi[i])) {
				isMember = true;
				break;
			}
		}

		if (isMember == true) {
			System.out.println("�ҽ� ����� �¾ƿ�.");
			
		} else {

			try {
				String message = name + "��(��) �ҽ� ����� �ƴմϴ�.";
				throw new GirlException(message);

			} catch (GirlException e) {
				System.out.println( e.toString() );
				System.out.println( e.getMessage() );
				e.printStackTrace();
			}
			
		}
	}
}