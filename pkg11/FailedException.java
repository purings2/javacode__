package pkg11;

public class FailedException extends Exception {
	
	private String message ;
	
	public FailedException(String message) {
		this.message = message ;
	}
	
	@Override
	public String toString() {
		
		return "���� ���ڿ� : " + this.message ;
	}
	
	@Override
	public String getMessage() {
		
		return "�޽��� : " + this.message;
	}
	
	
}
