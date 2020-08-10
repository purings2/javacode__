package pkg05;
public class Account01 {
	public static void main(String[] args) {
		String soobank = "KB" ;
		String sooname = "김철수" ;
		int soono = 1234 ; //계좌 번호 
		int soobalance = 1000 ; //예치금
		
		System.out.println("거래처 : " + soobank );
		System.out.println("예금주 : " + sooname );
		System.out.println("계좌 번호 : " + soono );
		System.out.println("예치금 : " + soobalance );
		
		String heebank = "KB" ;
		String heename = "박영희" ;
		int heeno = 5678 ; //계좌 번호 
		int heebalance = 2000 ; //예치금
		
		System.out.println("거래처 : " + heebank );
		System.out.println("예금주 : " + heename );
		System.out.println("계좌 번호 : " + heeno );
		System.out.println("예치금 : " + heebalance );		
	}
}