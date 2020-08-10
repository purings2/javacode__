package pkg08;

public class Student extends Person {
	private int schoolYear ; //학년
	private String grade; // 학점
	
	public Student(String name, int age, String address, String phone, int type, int schoolYear, String grade) {
		super(name, age, address, phone, type);
		this.schoolYear = schoolYear ;
		this.grade = grade ;
	}
	
//	public void learn() {
//		System.out.println("학년 : " + this.schoolYear);
//		System.out.println("학점 : " + this.grade);
//		System.out.println( super.getName() + "이 공부합니다.");
//	} //공부하다.
			
	public String learn1() {
//		System.out.println("학년 : " + this.schoolYear);
//		System.out.println("학점 : " + this.grade);
//		System.out.println( super.getName() + "이 공부합니다.");
		String result ="";
		result+="학년 : " + this.schoolYear+"\n";
		result+="학점 : " + this.grade+"\n";
		result+= super.getName() + "이 공부합니다."+"\n";
		
		
		return result;
	} //공부하다.
			
	@Override
	public String toString() {
		String result ="";
		result = super.toString();
		result+= this.learn1();
				
		return result;
	}
	
	
	
}
