package pkg09;
public class Unicon implements Bird,Horse {
	
	private String name ;
	public Unicon(String name) {
		this.name = name ;
	}

	@Override
	public void fly() {
		String imsi = this.name + "��(��) " + Bird.speed + "�ӵ��� ���ƴ�ܿ�.";
		System.out.println(imsi);	
	}

	@Override
	public void run() {
		String imsi = this.name + "��(��) " + Horse.speed + "�ӵ��� �޷���.";
		System.out.println(imsi);		
	}

}