package myinterface;

public class PhoneMain02 {

	public static void main(String[] args) {
		String phoneNo = "01035111234" ;
		
		
		
		MiniPhone smartPhone = new MiniPhone(phoneNo) ;
		
		smartPhone.sendSMS();
		
		smartPhone.receiveSMS();
		
		System.out.print(27);
	}

}
