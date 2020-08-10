package pkg11;
public class LessThan5 extends Exception{
	private String message ; //오류 관련 메시지 저장 변수
	
	public LessThan5() {
	}
	
	public LessThan5(String message) {
		super(message);
		this.message = message ;
	}
	@Override
	public String toString() {
		return "오버로딩 : " + this.message;
	}
}