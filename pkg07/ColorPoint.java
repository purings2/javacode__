package pkg07;
public class ColorPoint extends Point {
	private String color ;	
	public void showColorPoint() {		
		System.out.println("»ö»ó : " + this.color);
		super.showPoint();
	} 
	public void setColor(String color) {
		this.color = color ;		
	}
}