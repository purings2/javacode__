package pkg05;
public class AccountMain1 {
	public static void main(String[] args) {
		Account1.bankname = "KB" ;
		
		Account1 soo = new Account1();
				
		Account1 hee ;
		hee = new Account1();
		
		soo.bankname = "�޷�" ; //writer
		soo.name = "��ö��";
		soo.no = 1234 ;
		soo.balance = 1000 ;
		
//		hee.bankname = "��������" ; 
		hee.name = "�ڿ���";
		hee.no = 5678 ;
		hee.balance = 2000 ;
		
		soo.showData();
		System.out.println("----------");
		hee.showData(); 
		
//		System.out.println("�ŷ�ó : " + soo.bankname);
//		System.out.println("������ : " + soo.name);
//		System.out.println("���� ��ȣ : " + soo.no);
//		System.out.println("��ġ�� : " + soo.balance);
//		
//		System.out.println("�ŷ�ó : " + hee.bankname);
//		System.out.println("������ : " + hee.name);
//		System.out.println("���� ��ȣ : " + hee.no);
//		System.out.println("��ġ�� : " + hee.balance);
	}
}

