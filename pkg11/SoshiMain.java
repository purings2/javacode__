package pkg11;

import java.util.Scanner;

public class SoshiMain {
	public static void main(String[] args) {
		String[] soshi = { "유리", "윤아", "써니" };

		Scanner scan = new Scanner(System.in);

		System.out.println("이름 입력 : ");

		String name = scan.next();

		// 멤버인지를 판단하는 변수
		// false면 멤버가 아니라고 가정합니다.
		boolean isMember = false;

		for (int i = 0; i < soshi.length; i++) {
			if (name.equals(soshi[i])) {
				isMember = true;
				break;
			}
		}

		if (isMember == true) {
			System.out.println("소시 멤버가 맞아요.");
			
		} else {

			try {
				String message = name + "은(는) 소시 멤버가 아닙니다.";
				throw new GirlException(message);

			} catch (GirlException e) {
				System.out.println( e.toString() );
				System.out.println( e.getMessage() );
				e.printStackTrace();
			}
			
		}
	}
}