package pkg11;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcClass cc = new CalcClass();
		
		System.out.println("계산할 수자를 입력하세요.");
		int max = sc.nextInt();
		System.out.println("수식은 다음과 같습니다.");
		System.out.println(cc.SquareSumExp(max));
		System.out.println("계산결과는 다음과 같습니다.");
		System.out.println("Result: " + cc.SquareSum(max));
	}
}