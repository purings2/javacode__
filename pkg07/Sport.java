package pkg07;

public class Sport {
	private String name ;
	private int entry ;
	
	public Sport(String name, int entry) {
		this.name = name ;
		this.entry = entry ;
	}

	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("인원수 : " + this.entry);
	}	
}
