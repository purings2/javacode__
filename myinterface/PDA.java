package myinterface;

public class PDA {
	public int calculate(int x, int y) {
		int hap = x + y ;
		return hap ;
	}
	
	public int calculatePlus(int x, int y) {
		return x + y ;
	}
	
	public int calculateMinus(int x, int y) {
		return x - y ;
	}
	
	public int calculateMultiply(int x, int y) {
		return x * y ;
	}
	
	public int calculateDivide(int x, int y) {
		return x / y ;
	}
	
	public PDA() {
	}
}
