package pkg13;

import java.util.ArrayList;
import java.util.List;

public class DosirakMain {
	public static void main(String[] args) {
		Saram soo = new Saram("��ö��", "���� ������") ; // �� ��ö��
	
		String[] banchan1 = new String[] {"��� �", "��ġ", "��ȣ�� ������"};
		Dosirak dosirak1 = new Dosirak(soo, "��ȭ���ö�", 10000, banchan1) ;
		
		List<Dosirak> lists = new ArrayList<Dosirak>();
						
		lists.add(dosirak1);
		
		lists.add(new Dosirak(new Saram("�ڿ���", "��� ������"), 
				"���޷����ö�", 
				7000, 
				new String[] {"��� �Ķ���", "��", "���� ��ġ"}));
				
		System.out.println("���ö� �ֹ� ����");
		System.out.println("����/�����/���ö��̸�/�ܰ�/����1/����2/����3");
		
		Delivery(lists);	
		
		
			
		}
		
		

		private static void Delivery(List<Dosirak> lists) {
			
			
			
			for (Dosirak dosirak : lists) {
				String name = dosirak.getSaram().getName();
				String address = dosirak.getSaram().getAddress();
				String dname = dosirak.getDname();
				int price = dosirak.getPrice();
				String banchan = dosirak.getBanchan();
				
				
				String imsi = "";
				imsi += name + "/" + address + "/" + dname + "/" + price + "/" + banchan ;
				
				System.out.println(imsi);
			}
	}
	}
	
	

