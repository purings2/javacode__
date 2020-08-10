package pkg13;

public class Dosirak {

	private Saram saram; // Saram ��ü
	private String dname; // ���ö� �̸�
	private int price; // �ܰ�
	private String[] banchan ; // ���� 3��

	public Saram getSaram() {
		return saram;
	}

	public String getDname() {
		return dname;
	}

	public int getPrice() {
		
		return price;
	}

	public String getBanchan() {
		
		String imsi = "";
		
		for (int i = 0; i < banchan.length; i++) {
			
			if ( i == 0 ) {
				imsi += banchan[i] ;
			}
			if ( i != 0) {
				imsi += "/" + banchan[i] ;
			}
			
		}
		return imsi;
	}

	public Dosirak(Saram saram, String dname, int price, String[] banchan) {
		this.saram = saram;
		this.dname = dname;
		this.price = price;
		this.banchan = banchan;
	}

}
