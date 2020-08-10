package pkg05;
public class AccountMain2 {
	public static void main(String[] args) {
		Account2 soo ;
		soo = new Account2();
		
		Account2 hee = new Account2("박영희", 5678, 2000);
		
		Account2 kang ;
		kang = new Account2("강감찬", 4444, 5555);
		
		soo.showData();
		System.out.println("-------");
		hee.showData();		
		System.out.println("-------");
		kang.showData();	
 		 
	}
}