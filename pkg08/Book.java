package pkg08;

public class Book {
	private String name ;
	private double price ;
	private String education ; //�������
	
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
		result += "���� : " + this.name + "\n" ;
		result += "������ : " + this.price + "\n" ;
		result += "���� ��� : " + this.education + "" ;
		return result;
	}
	public Book (String name, double price, String education) {
		this.name = name ;
		this.price = price ;
		this.education = education ;
	}
}
