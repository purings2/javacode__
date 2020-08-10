package pkg06;
public class StaticTest {
	public static void main(String[] args) {
		System.out.println( MyStatic.x );
		
		//System.out.println(MyStatic.y);
		
		//obj를 인스턴스라고 부른다.
		MyStatic obj = new MyStatic(); 
		System.out.println(obj.y);
		
		MyStatic.add(10, 20); 
		
		obj.hello("안녕하세요.");
		
		double radius = 10.0 ;
		//MyStatic.PI = 5.14 ;
		
		
		double area = MyStatic.PI * radius * radius ;
		System.out.println("면적 : " + area); 
		
	}
}