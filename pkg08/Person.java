package pkg08;

public class Person {
	private String name ; //이름
	private int age ; //나이
	private String address ; //주소
	private String phone ; //전화 번호
	private int type; //타입(직원 1, 선생2, 학생 3)
	
	public Person(String name, int age, String address, String phone, int type) {
		this.name = name ;
		this.age = age ;
		this.address = address ;
		this.phone = phone ;
		this.type = type ;
	}
	
	public String getName() {
		return name;
	}
		
	public void Display() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.address);
		System.out.println("전화 번호 : " + this.phone);
		System.out.println("타입 : " + this.type);
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String status = "";
		status += "이름 : " + this.name ;
		return status;
	}
	
	
}
