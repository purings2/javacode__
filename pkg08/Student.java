package pkg08;

public class Student extends Person {
	private int schoolYear ; //�г�
	private String grade; // ����
	
	public Student(String name, int age, String address, String phone, int type, int schoolYear, String grade) {
		super(name, age, address, phone, type);
		this.schoolYear = schoolYear ;
		this.grade = grade ;
	}
	
//	public void learn() {
//		System.out.println("�г� : " + this.schoolYear);
//		System.out.println("���� : " + this.grade);
//		System.out.println( super.getName() + "�� �����մϴ�.");
//	} //�����ϴ�.
			
	public String learn1() {
//		System.out.println("�г� : " + this.schoolYear);
//		System.out.println("���� : " + this.grade);
//		System.out.println( super.getName() + "�� �����մϴ�.");
		String result ="";
		result+="�г� : " + this.schoolYear+"\n";
		result+="���� : " + this.grade+"\n";
		result+= super.getName() + "�� �����մϴ�."+"\n";
		
		
		return result;
	} //�����ϴ�.
			
	@Override
	public String toString() {
		String result ="";
		result = super.toString();
		result+= this.learn1();
				
		return result;
	}
	
	
	
}
