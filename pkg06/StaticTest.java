package pkg06;
public class StaticTest {
	public static void main(String[] args) {
		System.out.println( MyStatic.x );
		
		//System.out.println(MyStatic.y);
		
		//obj�� �ν��Ͻ���� �θ���.
		MyStatic obj = new MyStatic(); 
		System.out.println(obj.y);
		
		MyStatic.add(10, 20); 
		
		obj.hello("�ȳ��ϼ���.");
		
		double radius = 10.0 ;
		//MyStatic.PI = 5.14 ;
		
		
		double area = MyStatic.PI * radius * radius ;
		System.out.println("���� : " + area); 
		
	}
}