package pkg09;

public class Eagle extends Animal{

	public Eagle(String name, String location) {
		super(name, location) ;
	}

	@Override
	public void move() {
		String imsi = super.getName() + "��(��) " + super.getLocation() + "���� ���� ���ƴ��� �ֽ��ϴ�." ;
		System.out.println( imsi );
		
	}

}
