package pkg11;

public class MyException03 {
	public static void main(String[] args) {

		try {
			String xx = "aa";
			first(xx);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ��");
		} catch (NumberFormatException e) {
			System.out.println("���� ����ȯ ����");
		} catch (Exception e) {
			System.out.println("������ �׸��");
		} finally {
			System.out.println("������ �۾��� ���⼭.");
		}
	}

	private static void first(String xx) throws ArithmeticException, NumberFormatException {
		int x = Integer.parseInt(xx);
		second();
	}

	private static void second() throws ArithmeticException {
		third();
	}

	private static void third() throws ArithmeticException {
		int i = 1, j = 0;
		System.out.println(i / j);
	}
}
