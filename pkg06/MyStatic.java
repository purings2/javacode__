package pkg06;
public class MyStatic {
	//Ŭ���� ���� : Ŭ���� �̸����� ������ ����	
	static int x = 300 ;
	
	//�ν��Ͻ� ���� : �ݵ�� ��ü�� �̿��Ͽ� �����ؾ� �Ѵ�.
	int y = 200 ;
	
	//final Ű����� �б� ������ ���Ͽ� ���ȴ�.
	static final double PI = 3.14 ;
	
	//�ν��Ͻ� �޼ҵ�
	public void hello(String aa) {
		System.out.println(aa);
	}
	
	//static �޼ҵ� = Ŭ���� �޼ҵ�
	public static void add(int x, int y) {
		int result = x + y ; //���� ����
		System.out.println( result );
	}
}