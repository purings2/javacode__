package pkg05;
public class AccountMain1 {
	public static void main(String[] args) {
		Account1.bankname = "KB" ;
		
		Account1 soo = new Account1();
				
		Account1 hee ;
		hee = new Account1();
		
		soo.bankname = "메롱" ; //writer
		soo.name = "김철수";
		soo.no = 1234 ;
		soo.balance = 1000 ;
		
//		hee.bankname = "국민은행" ; 
		hee.name = "박영희";
		hee.no = 5678 ;
		hee.balance = 2000 ;
		
		soo.showData();
		System.out.println("----------");
		hee.showData(); 
		
//		System.out.println("거래처 : " + soo.bankname);
//		System.out.println("예금주 : " + soo.name);
//		System.out.println("계좌 번호 : " + soo.no);
//		System.out.println("예치금 : " + soo.balance);
//		
//		System.out.println("거래처 : " + hee.bankname);
//		System.out.println("예금주 : " + hee.name);
//		System.out.println("계좌 번호 : " + hee.no);
//		System.out.println("예치금 : " + hee.balance);
	}
}

