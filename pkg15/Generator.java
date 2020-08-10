package pkg15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Generator extends Thread {
	@Override
	public void run() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Random random = new Random();
		
		try {
			
			for (int i = 0; i < 100; i++) {
				Thread.sleep(200);
				int key = random.nextInt(10) + 1;
				
				
				if (map.containsKey(key)) {
					map.put(key, map.get(key)+1) ;
				} else {
					map.put(key, 1) ;
				}
				
			}
			
			Set<Integer> keylist = map.keySet();
			
			for (Integer key : keylist) {
				System.out.println( key + "/" + map.get(key));
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
				
		
		
	}
}
