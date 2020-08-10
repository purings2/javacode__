package pkg05;

public class Account3 {
	String name ; 
	int no ; 
	private int balance ; 
	private String status ; //일반, vip 고객
	
	void setBalance(int balance) {
		this.balance += balance ;
	}
	
	int getBalance() {
		return this.balance ;
	}

	public Account3(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		
		if (this.balance >= 1500) {
			this.status = "vip 고객" ;
		} else {
			this.status = "일반 고객" ;
		}
	}

	void showData() {
		System.out.println("예금주 : " + this.name);
		System.out.println("계좌 번호 : " + this.no);
		System.out.println("예치금 : " + this.balance);
		System.out.println("" + this.status);		
	}
}
 




