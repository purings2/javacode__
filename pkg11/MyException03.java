package pkg11;

public class MyException03 {
	public static void main(String[] args) {

		try {
			String xx = "aa";
			first(xx);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형변환 오류");
		} catch (Exception e) {
			System.out.println("나머지 항목들");
		} finally {
			System.out.println("마무리 작업은 여기서.");
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
