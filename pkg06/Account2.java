package pkg06;

public class Account2 {
	String name ;
	int no ;
	int balance ;
	
	void Display() {
		System.out.println("예금주 : " + this.name);
		System.out.println("계좌 번호 : " + this.no);
		System.out.println("예치금 : " + this.balance);
	}
}