package pkg13;

public class Hakseng {

	private String name;
	private int no;
	private int ban;
	private int kor;
	private int eng;
	private int math;

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public int getBan() {
		return ban;
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

	public Hakseng(String name, int no, int ban, int kor, int eng, int math) {
		this.name = name;
		this.no = no;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
