package pkg08;

public class PersonMain {

	public static void main(String[] args) {
		Person[] saram = {
			new Student("��ö��", 30, "���� ������", "01012345678", 3, 2, "A"), //2�г� A����
//			new Teacher("�ڿ���", 40, "��� ������", "01033334444", 2, "�ڹ�"), //�ڹ� ����ħ
//			new Staff("������", 50, "���� ���ﵿ", "01055556666", 1, "�ѹ�")  //�ѹ��ο� �ٹ���
		} ;

		for (int i = 0; i < saram.length; i++) {
			System.out.println();
			System.out.println( saram[i] ); //�ش� ��ü�� ������ ����ϼ���.
		}
				
		
	}

}
