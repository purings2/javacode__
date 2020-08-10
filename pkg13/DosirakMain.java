package pkg13;

import java.util.ArrayList;
import java.util.List;

public class DosirakMain {
	public static void main(String[] args) {
		Saram soo = new Saram("김철수", "마포 공덕동") ; // 고객 김철수
	
		String[] banchan1 = new String[] {"고급 어묵", "김치", "단호박 샐러드"};
		Dosirak dosirak1 = new Dosirak(soo, "매화도시락", 10000, banchan1) ;
		
		List<Dosirak> lists = new ArrayList<Dosirak>();
						
		lists.add(dosirak1);
		
		lists.add(new Dosirak(new Saram("박영희", "용산 도원동"), 
				"진달래도시락", 
				7000, 
				new String[] {"계란 후라이", "김", "마른 멸치"}));
				
		System.out.println("도시락 주문 내역");
		System.out.println("고객명/배송지/도시락이름/단가/반찬1/반찬2/반찬3");
		
		Delivery(lists);	
		
		
			
		}
		
		

		private static void Delivery(List<Dosirak> lists) {
			
			
			
			for (Dosirak dosirak : lists) {
				String name = dosirak.getSaram().getName();
				String address = dosirak.getSaram().getAddress();
				String dname = dosirak.getDname();
				int price = dosirak.getPrice();
				String banchan = dosirak.getBanchan();
				
				
				String imsi = "";
				imsi += name + "/" + address + "/" + dname + "/" + price + "/" + banchan ;
				
				System.out.println(imsi);
			}
	}
	}
	
	

