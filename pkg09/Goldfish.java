package pkg09;

public class Goldfish extends Animal{

	public Goldfish(String name, String location) {
		super(name, location) ;
	}

	@Override
	public void move() {
		String imsi = super.getName() + "��(��) " + super.getLocation() + "���� �Ϳ��� ���ġ�� �ֽ��ϴ�." ;
		System.out.println( imsi );
		
	}

}
