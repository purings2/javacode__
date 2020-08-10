package pkg09;

public class Lion extends Animal {
	
	public Lion() {		
	}
	
	public Lion(String name, String location) {
		super(name, location) ;
	}

	@Override
	public void move() { //구현화(implementation)된 메소드
		String imsi = super.getName() + "가(이) " + super.getLocation() + "에서 열심히 달리고 있습니다." ;
		System.out.println(imsi);
	}

}
