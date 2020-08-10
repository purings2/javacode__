package pkg11;

public class CalcClass {
	int SquareSum(int max) {
		int sum = 0;
		for (int i = 1; i <= max ; i++) {
			if ( i % 2 == 0 ) {
				sum -= Math.pow(i, 3) ;
			} else {
				sum += Math.pow(i, 2) ;
			}
		}
		return sum;
		
	}

	public String SquareSumExp(int max) {
		String exp = "";
		for (int i = 1; i <= max; i++) {
			if ( i == 1 ) {
				exp += i + "^2" ;
			} else if ( i % 2 == 0) {
				exp += " - " + i + "^3" ;
			} else {
				exp += " + " + i + "^2" ;
			}
				
		}
		return exp;
	}
}
