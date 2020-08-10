package pkg10;

public enum ShoesTypeName {
	WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("하이킹화") ;

	private String name;
	
	private ShoesTypeName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return name;
	}
}
