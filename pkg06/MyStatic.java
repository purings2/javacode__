package pkg06;
public class MyStatic {
	//클래스 변수 : 클래스 이름으로 접근이 가능	
	static int x = 300 ;
	
	//인스턴스 변수 : 반드시 객체를 이용하여 접근해야 한다.
	int y = 200 ;
	
	//final 키워드는 읽기 전용을 위하여 사용된다.
	static final double PI = 3.14 ;
	
	//인스턴스 메소드
	public void hello(String aa) {
		System.out.println(aa);
	}
	
	//static 메소드 = 클래스 메소드
	public static void add(int x, int y) {
		int result = x + y ; //지역 변수
		System.out.println( result );
	}
}