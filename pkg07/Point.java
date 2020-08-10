package pkg07;
public class Point {
	private int xpos ;
	private int ypos ;	
	public void showPoint() {
		String imsi = "ÁÂÇ¥ : (" + xpos + ", " + ypos + ")";
		System.out.println( imsi ); 
	}	
	public void set(int xpos, int ypos) {
		this.xpos = xpos ;
		this.ypos = ypos ;
	}
}