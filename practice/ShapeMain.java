package practice;

public class ShapeMain {

	public static void main(String[] args) {
		
		Circle circle = new Circle(3.0, 4.0, 10.0) ;
		circle.showData();
		System.out.println();
		// ���� �߽� : (3, 4)
		// ������ : 10
		// ���� ���� :  
		// ���� �ѷ� : 
		
		Triangle tri = new Triangle(10.0, 10.0);
		tri.showData();
		// �ﰢ���� ���� : ����������
		// �ﰢ���� �ѷ� : ������
		
		int total = 0 ;
		for(int i = 1 ; i < 11 ; i++) {
				total += i;
		}
		System.out.println("���� : " + total) ;
		
		total = 0 ;
		int i = 1 ;
		while ( i < 11 ) {
				total += i;
				i++ ;
		}

		System.out.println("���� : " + total) ;

	}

}
