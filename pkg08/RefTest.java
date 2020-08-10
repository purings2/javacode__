package pkg08;

class MySuper3{
	int x = 100 ;
	public void showData() {
		System.out.println("하하");
	}
}

class MySub3 extends MySuper3{
	int y = 200 ;
	
	@Override
	public String toString() {
//		return super.toString() + "\nabc" ;
		String imsi = super.toString() + "\nabc" ;
 		return imsi ;
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("호호");
	}
	public void Display() {
		System.out.println("가나다");
	}
}

public class RefTest {
	public static void main(String[] args) {
		MySuper3 sub = new MySub3(); //승급
//		System.out.println(sub.y);
		System.out.println(sub.x);
		sub.showData();
		
		System.out.println(sub);
		System.out.println(sub.toString());
		
		int i = (int)3.14 ;
		MySub3 _sub = (MySub3)sub; //강등
		
		System.out.println(_sub.y);
		_sub.Display();
	}
}