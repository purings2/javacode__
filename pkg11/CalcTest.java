package pkg11;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcClass cc = new CalcClass();
		
		System.out.println("����� ���ڸ� �Է��ϼ���.");
		int max = sc.nextInt();
		System.out.println("������ ������ �����ϴ�.");
		System.out.println(cc.SquareSumExp(max));
		System.out.println("������� ������ �����ϴ�.");
		System.out.println("Result: " + cc.SquareSum(max));
	}
}