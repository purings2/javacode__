package pkg06;

import java.util.Scanner;

public class GoodArray {
	public static void main(String[] args) {
		Good[] prod = new Good[2];
		
		//scan ��ü
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println("��ǰ �̸� : ");
			String name = scan.next();
			
			System.out.println("��ǰ ���� : ");
			int price = scan.nextInt() ;
			
			System.out.println("��ǰ ��� : ");
			int stock = scan.nextInt() ;
			
			System.out.println("�Ǹŵ� ���� : ");
			int sold = scan.nextInt() ;
			
			prod[i] = new Good(name, price, stock, sold) ;
		}
		
		
		for (int i = 0; i < prod.length; i++) {
			prod[i].showData();
		}
		
		System.out.println( Good.totalprice ); 
	}
}