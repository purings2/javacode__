package pkg07;

public class Baseball extends Sport {
	private double hitrate ; 
	public Baseball(String name, int entry, double hitrate) {
		super(name, entry);
		this.hitrate = hitrate ;
	}
	public void showData() {
		super.showInfo();
		System.out.println("Å¸À² : " + this.hitrate);
	}
}
