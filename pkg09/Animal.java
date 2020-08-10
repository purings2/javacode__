package pkg09;

public abstract class Animal {
	private String name ;
	private String location ;
	
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	public Animal(String name, String location) {
		this.name = name ;
		this.location = location ;
	}
	
	public Animal() {		
	}
	
	public abstract void move() ;
	
//	public void move() {
//		String imsi = this.name + "이(가) " + this.location + "에서 움직입니다." ;
//		System.out.println(imsi);
//	}
	
}