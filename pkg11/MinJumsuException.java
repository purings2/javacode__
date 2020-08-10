package pkg11;

public class MinJumsuException extends Exception {
	
	private String message ;
	
	public MinJumsuException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "예외 문자열: " + this.message ;
	}
	
	@Override
	public String getMessage() {
		
		return "메시지 : " + this.message;
	}
	
	
}
