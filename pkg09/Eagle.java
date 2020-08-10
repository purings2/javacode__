package pkg09;

public class Eagle extends Animal{

	public Eagle(String name, String location) {
		super(name, location) ;
	}

	@Override
	public void move() {
		String imsi = super.getName() + "가(이) " + super.getLocation() + "에서 훨훨 날아댕기고 있습니다." ;
		System.out.println( imsi );
		
	}

}
