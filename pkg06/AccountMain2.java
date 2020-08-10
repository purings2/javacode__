package pkg06;

public class AccountMain2 {
	public static void main(String[] args) {
		//배열 2개를 선언
		Account2[] account ;
		account = new Account2[2] ;
		
		for (int i = 0; i < account.length; i++) {
			//i번째 항목에 대한 객체 생성
			account[i] = new Account2(); 
		}
		
		account[0].name = "김철수" ;
		account[0].no = 1234;
		account[0].balance = 1000 ;
		
		account[1].name = "박영희" ;
		account[1].no = 5678 ;
		account[1].balance = 2000 ;
		
		for (int i = 0; i < account.length; i++) {
			account[i].Display();
		}		
	}
}









