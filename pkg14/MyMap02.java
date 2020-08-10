package pkg14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap02 {
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();

		myMap.put("name", "홍길동");
		myMap.put("address", "신촌");
		myMap.put("phone", "11112222");
		myMap.put("password", "abc1234");

		if (!myMap.containsKey("gender")) {
			myMap.put("gender", "남자");
		}

		Set<String> mySet = myMap.keySet();

		for (String key : mySet) {
			String value = myMap.get(key);
			System.out.println("키 : " + key + " 값 : " + value);
		}

		System.out.println("요소 크기 : " + myMap.size());

		System.out.println(myMap);
	}
}