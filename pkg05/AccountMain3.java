package pkg05;
public class AccountMain3 {
	public static void main(String[] args) {
		Account3 soo ;
		soo = new Account3("��ö��", 111, 1000);
		
		Account3 hee ;
		hee = new Account3("�ڿ���", 222, 2000);
		
		soo.showData();
		System.out.println("-------");
		hee.showData();		
		
		soo.setBalance(300);
		
		System.out.println("ö���� �ܾ� : " + soo.getBalance());
	}
}