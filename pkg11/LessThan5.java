package pkg11;
public class LessThan5 extends Exception{
	private String message ; //���� ���� �޽��� ���� ����
	
	public LessThan5() {
	}
	
	public LessThan5(String message) {
		super(message);
		this.message = message ;
	}
	@Override
	public String toString() {
		return "�����ε� : " + this.message;
	}
}