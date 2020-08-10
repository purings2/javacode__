package practice;

public class ShapeMain {

	public static void main(String[] args) {
		
		Circle circle = new Circle(3.0, 4.0, 10.0) ;
		circle.showData();
		System.out.println();
		// 원의 중심 : (3, 4)
		// 반지름 : 10
		// 원의 면적 :  
		// 원의 둘레 : 
		
		Triangle tri = new Triangle(10.0, 10.0);
		tri.showData();
		// 삼각형의 면적 : ㅁㄴㄹㅇㅁ
		// 삼각형의 둘레 : ㅁㅇㄻ
		
		int total = 0 ;
		for(int i = 1 ; i < 11 ; i++) {
				total += i;
		}
		System.out.println("총합 : " + total) ;
		
		total = 0 ;
		int i = 1 ;
		while ( i < 11 ) {
				total += i;
				i++ ;
		}

		System.out.println("총합 : " + total) ;

	}

}
