package pkg06;
public class Good {
	private String name ;
	private int price ;
	private int stock ;
	private int sold ;
	
	static int totalprice ; //��ü �� �ݾ�
	
	public void showData() {
		System.out.println("�̸� : " +  this.name);
		System.out.println("���� : " +  this.price);
		System.out.println("��� : " +  this.stock);
		System.out.println("�Ǹ� ���� : " +  this.sold);
	}
	
	public Good(String name, int price, int stock, int sold) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.sold = sold;
		totalprice += price * sold ;
	}
	
	
	
}