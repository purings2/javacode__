package pkg13;

public class Saram {
	private String name ; //주문자 이름
	private String address ; //배송지
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	
	public Saram(String name, String address) {
		this.name = name ;
		this.address = address ;
	}
}
