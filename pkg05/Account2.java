package pkg05;

public class Account2 {
	String name ; //예금주
	int no ; //계좌 번호
	int balance ; //예치금
	
	public Account2() {
	}

	public Account2(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	void showData() {
		System.out.println("예금주 : " + this.name);
		System.out.println("계좌 번호 : " + this.no);
		System.out.println("예치금 : " + this.balance);
	}
}