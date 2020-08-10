package pkg09;
public class Unicon implements Bird,Horse {
	
	private String name ;
	public Unicon(String name) {
		this.name = name ;
	}

	@Override
	public void fly() {
		String imsi = this.name + "이(가) " + Bird.speed + "속도로 날아댕겨용.";
		System.out.println(imsi);	
	}

	@Override
	public void run() {
		String imsi = this.name + "이(가) " + Horse.speed + "속도로 달려용.";
		System.out.println(imsi);		
	}

}