package pkg07;

class MySuper{
	int x = 100 ;
	private String hello = "�ȳ��ϼ���." ;
	public void sayHello() {
		System.out.println("�޽��� : " + this.hello );
	}
}

class MySub extends MySuper{
	int y = 200 ;
}

public class InheTest {
	public static void main(String[] args) {
		MySub sub = new MySub();
		sub.y = 300 ;
		System.out.println("sub.y : " + sub.y);
		
		sub.x = 500 ;
		System.out.println("sub.x : " + sub.x);
		
		sub.sayHello();
	}
}