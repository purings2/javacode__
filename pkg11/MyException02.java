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
			System.out.println("0으로 나누지 마세요.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과 문제");

		} catch (NullPointerException e) {
			System.out.println("객체가 참조되지 않고 있습니다.");

		} catch (Exception e) {
			System.out.println("기타 예외 발생");

		}finally {
			System.out.println("마무리 작업은 여기서 ...");
		}

	}

}
