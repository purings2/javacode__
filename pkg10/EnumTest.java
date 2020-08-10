package pkg10;

public class EnumTest {
	public static void main(String[] args) {
		Shoes shoe1 = new Shoes("나이키", 230, ShoesType.RUNNING, ShoesTypeName.RUNNING) ;
		shoe1.Display();
		System.out.println();
		
		ShoesType[] aaa = ShoesType.values() ;
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
		
		//특정 원소를 찾고자 할 때 사용한다.
		ShoesType myType = ShoesType.valueOf("RUNNING") ;
		System.out.println();
		System.out.println( myType );
	}
}