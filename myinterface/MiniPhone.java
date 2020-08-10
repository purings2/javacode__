package myinterface;

public class MiniPhone extends SmartPhone {

	public MiniPhone(String phoneNo) {
		super(phoneNo);
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("¹®ÀÚ¿Ó¼õ : " + super.getPhoneNo() );
		return false;
	}
	
	@Override
	public boolean sendSMS() {
		System.out.println("¹®ÀÚ°¬¼õ : " + super.getPhoneNo());
		return false;
	}

	
	
	
}
