package pkg08;

public class PersonMain {

	public static void main(String[] args) {
		Person[] saram = {
			new Student("김철수", 30, "마포 공덕동", "01012345678", 3, 2, "A"), //2학년 A학점
//			new Teacher("박영희", 40, "용산 도원동", "01033334444", 2, "자바"), //자바 가르침
//			new Staff("최직원", 50, "강남 역삼동", "01055556666", 1, "총무")  //총무부에 근무함
		} ;

		for (int i = 0; i < saram.length; i++) {
			System.out.println();
			System.out.println( saram[i] ); //해당 객체의 정보를 출력하세요.
		}
				
		
	}

}
