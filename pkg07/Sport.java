package pkg07;

public class Sport {
	private String name ;
	private int entry ;
	
	public Sport(String name, int entry) {
		this.name = name ;
		this.entry = entry ;
	}

	public void showInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("�ο��� : " + this.entry);
	}	
}
