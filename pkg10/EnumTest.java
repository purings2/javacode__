package pkg10;

public class EnumTest {
	public static void main(String[] args) {
		Shoes shoe1 = new Shoes("����Ű", 230, ShoesType.RUNNING, ShoesTypeName.RUNNING) ;
		shoe1.Display();
		System.out.println();
		
		ShoesType[] aaa = ShoesType.values() ;
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
		
		//Ư�� ���Ҹ� ã���� �� �� ����Ѵ�.
		ShoesType myType = ShoesType.valueOf("RUNNING") ;
		System.out.println();
		System.out.println( myType );
	}
}