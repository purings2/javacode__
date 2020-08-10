package pkg07;
class MySuper2{
	private String name ; 
	public MySuper2() {
		System.out.println("매개 변수가 없는 MySuper2 생성자 호출됨");
	}
	public MySuper2(String name) {
		System.out.println("호호호");
		this.name = name ;
	}
	public void showData() {
		System.out.println("이름 : " + this.name);
	}
}
class MySub2 extends MySuper2{
	public MySub2() {
		super();
		System.out.println("매개 변수가 없는 MySub2 생성자 호출됨"); 
	}
	public MySub2(String name) {
		super(name);
		System.out.println("매개 변수 1개짜리  MySub2 생성자 호출됨"); 
	}
}
public class InheTest2 {
	public static void main(String[] args) {
		MySub2 sub = new MySub2();
		
		MySub2 soo = new MySub2("김철수");
		soo.showData();
	}
}