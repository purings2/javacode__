package pkg02;

public class Switch01 {
	public static void main(String[] args) {
		int su = 4 ;
		
		switch(su){
		case 1:
			System.out.println("È¦¼ö");
			break ;
		case 2:
			System.out.println("Â¦¼ö");
			break ;
		case 3:
			System.out.println("È¦¼ö");
			break ;
		case 4:
			System.out.println("Â¦¼ö");
			break ;
		case 5:
			System.out.println("È¦¼ö");
			break ;
		case 6:
			System.out.println("Â¦¼ö");
			break ;
		}
		
		System.out.println("*********************");
		
		switch(su) {
		case 1: case 3:	case 5:
			System.out.println("È¦¼ö");
			break ;
		case 2:	case 4:	case 6:
			System.out.println("Â¦¼ö");
			break ;
		}
		
		int score = 75 ;
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("AÇÐÁ¡");
			break ;
		case 8:
			System.out.println("BÇÐÁ¡");
			break ;
		case 7:
			System.out.println("CÇÐÁ¡");
			break ;
		case 6:
			System.out.println("DÇÐÁ¡");
			break ;
			
		default:
			System.out.println("FÇÐÁ¡");
			break ;	
		}
		
		int month = 7 ;
		switch(month) {
		case 3: case 4:	case 5:
			System.out.println("º½");
			break ;
		case 6: case 7:	case 8:
			System.out.println("¿©¸§");
			break ;
		case 9: case 10:case 11:
			System.out.println("°¡À»");
			break ;
		case 12: case 1:	case 2:
			System.out.println("°Ü¿ï");
			break ;			
		}
		
	}
}








