package pkg09;

public class Interface01 implements Display {
	private int speed = Speed.SPEED ;
	
	
	public static void main(String[] args) {
		Interface01 obj = new Interface01();
		obj.speedUp(80);
		obj.display();
		obj.speedDown(50);
		obj.display();
	}

	@Override
	public void speedUp(int inc) {
		System.out.println(inc + "��ŭ ����");
		this.speed += inc ;
	}

	@Override
	public void speedDown(int dec) {
		System.out.println(dec + "��ŭ ����");
		this.speed -= dec ;
	}

	@Override
	public void display() {
		System.out.println("���� �ӵ� : " + this.speed);
	}

}
