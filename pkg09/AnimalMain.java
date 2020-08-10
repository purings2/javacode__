package pkg09;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];

		animal[0] = new Lion("����", "������ī �ʿ�");
		animal[1] = new Eagle("������", "â��");
		animal[2] = new Goldfish("�ݺؾ�", "����");
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}
		
//		Animal myani = new Animal();
		Animal myani = new Lion("����", "������ī �ʿ�");
		
		//�͸� inner type
		Animal myani2 = new Animal() {
			
			@Override
			public void move() {
				System.out.println("ȣȣȣ");
				
			}
		};
		
		myani2.move();
	}

}
