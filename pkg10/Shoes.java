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
		System.out.println("이름 : " + this.name);
		System.out.println("사이즈 : " + this.size);
		System.out.println("코드 : " + this.shoesType);
		System.out.println("한글 이름 : " + this.typeName.getName());
		
	}
	
	
}
