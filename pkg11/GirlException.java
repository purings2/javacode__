package pkg11;

public class GirlException extends Exception {
	
	private String message;

	public GirlException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "���ڿ� : " + this.message;
	}

	@Override
	public String getMessage() {
		return "�޽��� ���� : " + this.message;
	}
}