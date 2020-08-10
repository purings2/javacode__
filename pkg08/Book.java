package pkg08;

public class Book {
	private String name ;
	private double price ;
	private String education ; //교육기관
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getEducation() {
		return education;
	}
	
	@Override
	public String toString() {
		String result = "" ;
		result += "과목 : " + this.name + "\n" ;
		result += "수업료 : " + this.price + "\n" ;
		result += "교육 기관 : " + this.education + "" ;
		return result;
	}
	public Book (String name, double price, String education) {
		this.name = name ;
		this.price = price ;
		this.education = education ;
	}
}
