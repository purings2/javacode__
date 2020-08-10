package pkg09;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];

		animal[0] = new Lion("사자", "아프리카 초원");
		animal[1] = new Eagle("독수리", "창공");
		animal[2] = new Goldfish("금붕어", "어항");
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}
		
//		Animal myani = new Animal();
		Animal myani = new Lion("사자", "아프리카 초원");
		
		//익명 inner type
		Animal myani2 = new Animal() {
			
			@Override
			public void move() {
				System.out.println("호호호");
				
			}
		};
		
		myani2.move();
	}

}
