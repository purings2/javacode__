package pkg01;
public class PrintfEx {
	public static void main(String[] args) {
		int i = 65 ;
		char ch = 'a' ;
		double d = 12.3456789 ;
		int age = 35 ;
		String name = "ȫ�浿" ;
		
		System.out.println("���� : [" + i + "]") ;
		System.out.println("���� : [" + ch + "]") ;
				
		System.out.printf("����1 : [%d], ����2 : [%3d], ����3 : [%-3d]\n", i, i, i) ;
		
		System.out.printf("�Ǽ�1 : [%f]\n", d) ;
		System.out.printf("�Ǽ�2 : [%6.2f]\n", d) ;
		System.out.printf("�Ǽ�3 : [%.3f]\n", d) ;
		
		System.out.printf("������ ���ڷ� ��ȯ : [%c]\n", (char)i) ;
		System.out.printf("���ڸ� ������ ��ȯ : [%d]\n", (int)ch) ;
		
		System.out.printf("�̸� : [%s]\n", name) ;
	}
}