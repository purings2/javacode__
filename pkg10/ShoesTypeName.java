package pkg10;

public enum ShoesTypeName {
	WALKING("��ŷȭ"), RUNNING("����ȭ"), TRACKING("Ʈ��ŷȭ"), HIKING("����ŷȭ") ;

	private String name;
	
	private ShoesTypeName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return name;
	}
}
