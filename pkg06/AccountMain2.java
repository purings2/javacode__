package pkg06;

public class AccountMain2 {
	public static void main(String[] args) {
		//�迭 2���� ����
		Account2[] account ;
		account = new Account2[2] ;
		
		for (int i = 0; i < account.length; i++) {
			//i��° �׸� ���� ��ü ����
			account[i] = new Account2(); 
		}
		
		account[0].name = "��ö��" ;
		account[0].no = 1234;
		account[0].balance = 1000 ;
		
		account[1].name = "�ڿ���" ;
		account[1].no = 5678 ;
		account[1].balance = 2000 ;
		
		for (int i = 0; i < account.length; i++) {
			account[i].Display();
		}		
	}
}









