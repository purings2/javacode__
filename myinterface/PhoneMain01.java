package myinterface;

public class PhoneMain01 {

	public static void main(String[] args) {
		String phoneNo = "01065445678" ; //전화, 문자 보낼 곳
		String songName = "광화문 연가" ; //재생할 노래
		
		SmartPhone phone01 = new SmartPhone(phoneNo, songName) ;
		phone01.sendCall() ;
		phone01.play() ;
		
		System.out.println("phone01.calculate(3, 5) : " + phone01.calculate(3, 5) );
		
		phone01.receiveSMS() ;
		phone01.stop() ;

	}

}
