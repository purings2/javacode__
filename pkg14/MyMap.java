package pkg14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "삼성");
		map.put(2, "기아");
		map.put(3, "롯데");
		map.put(4, "SK");
		
		map.put(4, "넥센"); //동일한 키에 들어가면 오버라이딩된다.
		
		boolean bool = map.containsKey("6") ;
		System.out.println("키 확인 : " + bool);
		
		bool = map.containsValue("넥센") ;
		System.out.println("넥센 확인 : " + bool);
		
		//5위가 있는 지 확인하고, 없다면 "LG"를 추가해보세요.
		if (!map.containsKey(5)) {
			map.put(5, "LG");
		}
		
		Set<Integer> keylist = map.keySet();
		
		for(Integer key : keylist) {
			String value = map.get(key);
			System.out.println("키 : " + key + ", 값 :" + value);
		}
		
		map.clear();
		
		System.out.println("요소 크기 : " + map.size());
		System.out.println(map);
		
	}
}
