package pkg10;

public class Shoes {
	
	String name ;
	int size ;
	ShoesType shoesType ;
	ShoesTypeName typeName ;
	
	public Shoes(String name, int size, ShoesType shoesType, ShoesTypeName typeName ) {
		this.name = name ;
		this.size = size ;
		this.shoesType = shoesType ;
		this.typeName = typeName ;
	}

	public void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("������ : " + this.size);
		System.out.println("�ڵ� : " + this.shoesType);
		System.out.println("�ѱ� �̸� : " + this.typeName.getName());
		
	}
	
	
}
