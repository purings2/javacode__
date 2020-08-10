package pkg13;

public class Person {
	String name;
	int kor;
	int eng;
	int math;
	int total ;
	double average;

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public double getAverage() {
		return average;
	}

	public Person() {

	}

	public Person(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.total = kor + eng + math ;
		this.average = total / 3.0;
	}

}
