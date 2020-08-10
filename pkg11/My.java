package pkg11;

public class My {
	public static void main(String[] args) {
		int x = 3;

		try {
			if (x < 5) {
				// 1. 생성자 호출하여 예외 객체 생성,
				// 2. throw 구문으로 예외 발생
				throw new LessThan5("5보다 큰 수를 입력해 주시길 바랍니다.");
			} else {
				System.out.println("문제 없군요.");
			}
		} catch (LessThan5 e) {
			// e : 예외 객체라고 한다.
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}