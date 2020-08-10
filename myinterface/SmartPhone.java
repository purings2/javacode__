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
		imsi += this.songName + "을(를) 재생합니다 뾰로롱" ;
		System.out.println(imsi);
	}

	@Override
	public void stop() { 
		System.out.println(this.songName + "을(를) 재생 중지 합니다 뀨우..");
	}

	@Override
	public boolean sendCall() {
		System.out.println("수신자" + this.phoneNo + "에 전화 걸기");
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
		
			System.out.println("송신자" + this.phoneNo + "로부터 SMS 받기");
		
		return false;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	
	
	

}
