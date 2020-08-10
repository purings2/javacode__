package pkg06;

import java.util.Scanner;

public class GoodArray {
	public static void main(String[] args) {
		Good[] prod = new Good[2];
		
		//scan 객체
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println("상품 이름 : ");
			String name = scan.next();
			
			System.out.println("상품 가격 : ");
			int price = scan.nextInt() ;
			
			System.out.println("상품 재고 : ");
			int stock = scan.nextInt() ;
			
			System.out.println("판매된 수량 : ");
			int sold = scan.nextInt() ;
			
			prod[i] = new Good(name, price, stock, sold) ;
		}
		
		
		for (int i = 0; i < prod.length; i++) {
			prod[i].showData();
		}
		
		System.out.println( Good.totalprice ); 
	}
}