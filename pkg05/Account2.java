package pkg05;

public class Account2 {
	String name ; //������
	int no ; //���� ��ȣ
	int balance ; //��ġ��
	
	public Account2() {
	}

	public Account2(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	void showData() {
		System.out.println("������ : " + this.name);
		System.out.println("���� ��ȣ : " + this.no);
		System.out.println("��ġ�� : " + this.balance);
	}
}