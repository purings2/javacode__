package pkg13;

public class Candidate {
	private String name ;
	private String dang ;
	private double rate ;
	
	public String getName() {
		return name;
	}
	
	public String getDang() {
		return dang;
	}
	
	public double getRate() {
		return rate;
	}
	
	public Candidate() {
		
	}
	
	public Candidate(String name, String dang, double rate) {
		this.name = name ;
		this.dang = dang ;
		this.rate = rate ;
	}
}
