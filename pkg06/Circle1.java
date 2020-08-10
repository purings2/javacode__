package pkg06;

public class Circle1 {
	private double xpos ; //x ��ǥ
	private double ypos ; //y ��ǥ
	private double radius ; //������
	private double area ; // ������ Ŭ���� �ܺο��� �Է� �� �ʿ䰡 ����.
	private double perimeter ; //�ѷ�
	private String status ; //����, ����
	
	public Circle1(double xpos, double ypos, double radius) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
		
		//this.area = Math.PI * this.radius * this.radius ;
		this.area = Math.PI * Math.pow(this.radius, 2.0) ;
	}
		
	public String getStatus() {
		if(this.area >= 500) {
			this.status = "����" ;
		} else {
			this.status = "����" ;
		}
		return "���� : " + status;
	}

	void showData() {
		System.out.println("���� �߽� : (" + this.xpos + ", " + this.ypos + ")");
		System.out.println("������ : " + this.radius);
		
		
		System.out.printf("���� : %8.3f\n", this.area);
		
		this.perimeter = 2.0 * Math.PI * this.radius ;
		System.out.printf("�ѷ� : %8.3f\n", this.perimeter);
	}
}






