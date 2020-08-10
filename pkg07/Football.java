package pkg07;

public class Football extends Sport {
	private int goal ;
	
	public Football(String name, int entry, int goal) {
		super(name, entry);
		this.goal = goal ;
	}

	public void showData() {
		super.showInfo();
		System.out.println("°ñ¼ö : " + this.goal);
	}
}
