package pkg09;

public class Goldfish extends Animal{

	public Goldfish(String name, String location) {
		super(name, location) ;
	}

	@Override
	public void move() {
		String imsi = super.getName() + "이(가) " + super.getLocation() + "에서 귀엽게 헤엄치고 있습니다." ;
		System.out.println( imsi );
		
	}

}
