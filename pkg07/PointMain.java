package pkg07;
public class PointMain {
	public static void main(String[] args) {
		Point point = new Point();
		point.set(5, 7);
		point.showPoint(); 
		System.out.println();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4) ;
		cp.setColor("red");
		
		cp.showColorPoint();
		//cp.showPoint();
		System.out.println();
		
		String[] mycolor = new String[] {"blue", "yellow", "green"};
		
		ColorPoint[] mypoint = new ColorPoint[3] ;
		
		for (int i = 0; i < mypoint.length; i++) {
			mypoint[i] = new ColorPoint();
			mypoint[i].set(i, 2*i);
			mypoint[i].setColor(mycolor[i]);
			mypoint[i].showColorPoint();
		}
	}
}




