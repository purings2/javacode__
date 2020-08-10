package myinterface;

public class MiniPhone extends SmartPhone {

	public MiniPhone(String phoneNo) {
		super(phoneNo);
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("���ڿӼ� : " + super.getPhoneNo() );
		return false;
	}
	
	@Override
	public boolean sendSMS() {
		System.out.println("���ڰ��� : " + super.getPhoneNo());
		return false;
	}

}
