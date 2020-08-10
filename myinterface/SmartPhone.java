package myinterface;

public class SmartPhone extends PDA implements MobilePhone,Mp3 {
	private String phoneNo ;
	private String songName ;
	
	
	public SmartPhone(String phoneNo, String songName) {
		this.phoneNo = phoneNo ;
		this.songName = songName ;
		
	}
	
	public SmartPhone(String phoneNo) {
		this.phoneNo = phoneNo ;
	}
	
	
	@Override
	public void play() {
		String imsi = "";
		imsi += this.songName + "��(��) ����մϴ� �Ϸη�" ;
		System.out.println(imsi);
	}

	@Override
	public void stop() { 
		System.out.println(this.songName + "��(��) ��� ���� �մϴ� ���..");
	}

	@Override
	public boolean sendCall() {
		System.out.println("������" + this.phoneNo + "�� ��ȭ �ɱ�");
		return false;
	}

	@Override
	public boolean receiveCall() {
		return false;
	}

	@Override
	public boolean sendSMS() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean receiveSMS() {
		
			System.out.println("�۽���" + this.phoneNo + "�κ��� SMS �ޱ�");
		
		return false;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	
	
	

}
