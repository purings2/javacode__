package pkg05;
public class Account1 {
	static String bankname ; //�ŷ�ó
	String name ; //������
	int no ; //���� ��ȣ
	int balance ; //��ġ��
	
	// void : �޼ҵ尡 �����͸� ��ȯ���� ���� �� ����ϴ� Ű����
	// void�� no response�� �ǹ�
	void showData() {
		System.out.println("�ŷ�ó : " + bankname);
		System.out.println("������ : " + name);
		System.out.println("���� ��ȣ : " + no);
		System.out.println("��ġ�� : " + balance);
		
//		int x ;
//		System.out.println( x );
		
	}
}