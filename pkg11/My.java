package pkg11;

public class My {
	public static void main(String[] args) {
		int x = 3;

		try {
			if (x < 5) {
				// 1. ������ ȣ���Ͽ� ���� ��ü ����,
				// 2. throw �������� ���� �߻�
				throw new LessThan5("5���� ū ���� �Է��� �ֽñ� �ٶ��ϴ�.");
			} else {
				System.out.println("���� ������.");
			}
		} catch (LessThan5 e) {
			// e : ���� ��ü��� �Ѵ�.
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}