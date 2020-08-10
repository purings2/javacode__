package pkg06;
public class Good {
	private String name ;
	private int price ;
	private int stock ;
	private int sold ;
	
	static int totalprice ; //전체 총 금액
	
	public void showData() {
		System.out.println("이름 : " +  this.name);
		System.out.println("가격 : " +  this.price);
		System.out.println("재고 : " +  this.stock);
		System.out.println("판매 수량 : " +  this.sold);
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