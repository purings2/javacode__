package pkg09;

public class Lion extends Animal {
	
	public Lion() {		
	}
	
	public Lion(String name, String location) {
		super(name, location) ;
	}

	@Override
	public void move() { //����ȭ(implementation)�� �޼ҵ�
		String imsi = super.getName() + "��(��) " + super.getLocation() + "���� ������ �޸��� �ֽ��ϴ�." ;
		System.out.println(imsi);
	}

}
