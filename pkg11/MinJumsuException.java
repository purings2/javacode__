package pkg11;

public class MinJumsuException extends Exception {
	
	private String message ;
	
	public MinJumsuException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "���� ���ڿ�: " + this.message ;
	}
	
	@Override
	public String getMessage() {
		
		return "�޽��� : " + this.message;
	}
	
	
}
