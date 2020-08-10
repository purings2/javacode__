package pkg08;

public class Person {
	private String name ; //�̸�
	private int age ; //����
	private String address ; //�ּ�
	private String phone ; //��ȭ ��ȣ
	private int type; //Ÿ��(���� 1, ����2, �л� 3)
	
	public Person(String name, int age, String address, String phone, int type) {
		this.name = name ;
		this.age = age ;
		this.address = address ;
		this.phone = phone ;
		this.type = type ;
	}
	
	public String getName() {
		return name;
	}
		
	public void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�ּ� : " + this.address);
		System.out.println("��ȭ ��ȣ : " + this.phone);
		System.out.println("Ÿ�� : " + this.type);
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String status = "";
		status += "�̸� : " + this.name ;
		return status;
	}
	
	
}
