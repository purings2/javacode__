package pkg02;

public class If01 {

	public static void main(String[] args) {
		int su = 9 ;
		
		//su�� Ȧ���̸� ����ϼ���.
		if( su % 2 == 1 ) {
			System.out.println("Ȧ�� : " + su);
		}

		//Ȧ¦�� �Ǵ��Ͽ� ��� �ϼ���.
		if( su % 2 == 1 ) {
			System.out.println("Ȧ�� : " + su);
		}else {
			System.out.println("¦�� : " + su);
		}
		
		//su�� 3�� ����̸� "yes"�� �ƴϸ�, "no"�� ����ϱ�
		if( su % 3 == 0 ) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		int jumsu = 65 ;
		//60�� �̻��̸� �հ��Դϴ�. �հ� ����� ����ϼ���.
		if( jumsu >= 60 ) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		jumsu = 75 ; 
		
		if ( jumsu >= 90 ) {
			System.out.println("A ����"); 
			
		} else if ( jumsu >= 80 ) {
			System.out.println("B ����");
			
		} else if ( jumsu >= 70 ) {
			System.out.println("C ����");
			
		} else if ( jumsu >= 60 ) {
			System.out.println("D ����");
			
		} else {
			System.out.println("F ����"); 
		}
		
		
		
		
		
		
		
		int month = 7 ;
		if (month >= 3 && month <= 5) {
			System.out.println("��");
			
		} else if (month >= 6 && month <= 8 ) {
			System.out.println("����");
			
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("����");
			
		} else {
			System.out.println("�ܿ�");
		}
		
	}

}









