package pkg07;
class MySuper2{
	private String name ; 
	public MySuper2() {
		System.out.println("�Ű� ������ ���� MySuper2 ������ ȣ���");
	}
	public MySuper2(String name) {
		System.out.println("ȣȣȣ");
		this.name = name ;
	}
	public void showData() {
		System.out.println("�̸� : " + this.name);
	}
}
class MySub2 extends MySuper2{
	public MySub2() {
		super();
		System.out.println("�Ű� ������ ���� MySub2 ������ ȣ���"); 
	}
	public MySub2(String name) {
		super(name);
		System.out.println("�Ű� ���� 1��¥��  MySub2 ������ ȣ���"); 
	}
}
public class InheTest2 {
	public static void main(String[] args) {
		MySub2 sub = new MySub2();
		
		MySub2 soo = new MySub2("��ö��");
		soo.showData();
	}
}