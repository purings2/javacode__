package pkg05;

public class Account3 {
	String name ; 
	int no ; 
	private int balance ; 
	private String status ; //�Ϲ�, vip ��
	
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
			this.status = "vip ��" ;
		} else {
			this.status = "�Ϲ� ��" ;
		}
	}

	void showData() {
		System.out.println("������ : " + this.name);
		System.out.println("���� ��ȣ : " + this.no);
		System.out.println("��ġ�� : " + this.balance);
		System.out.println("" + this.status);		
	}
}
 




