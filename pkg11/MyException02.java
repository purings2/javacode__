package pkg11;

public class MyException02 {

	public static void main(String[] args) {

		int x = 3, y = 0;
		int[] arr = { 10, 20, 30 };
		String str = null;

		try {
			System.out.println(str.length());

			arr[3] = 50;

			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ������.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� �ʰ� ����");

		} catch (NullPointerException e) {
			System.out.println("��ü�� �������� �ʰ� �ֽ��ϴ�.");

		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");

		}finally {
			System.out.println("������ �۾��� ���⼭ ...");
		}

	}

}
