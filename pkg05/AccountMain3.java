package pkg05;
public class AccountMain3 {
	public static void main(String[] args) {
		Account3 soo ;
		soo = new Account3("±èÃ¶¼ö", 111, 1000);
		
		Account3 hee ;
		hee = new Account3("¹Ú¿µÈñ", 222, 2000);
		
		soo.showData();
		System.out.println("-------");
		hee.showData();		
		
		soo.setBalance(300);
		
		System.out.println("Ã¶¼öÀÇ ÀÜ¾× : " + soo.getBalance());
	}
}