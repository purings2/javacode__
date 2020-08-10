package pkg05;
public class Account1 {
	static String bankname ; //거래처
	String name ; //예금주
	int no ; //계좌 번호
	int balance ; //예치금
	
	// void : 메소드가 데이터를 반환하지 않을 때 사용하는 키워드
	// void는 no response의 의미
	void showData() {
		System.out.println("거래처 : " + bankname);
		System.out.println("예금주 : " + name);
		System.out.println("계좌 번호 : " + no);
		System.out.println("예치금 : " + balance);
		
//		int x ;
//		System.out.println( x );
		
	}
}