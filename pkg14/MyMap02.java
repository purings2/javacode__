package pkg14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap02 {
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();

		myMap.put("name", "ȫ�浿");
		myMap.put("address", "����");
		myMap.put("phone", "11112222");
		myMap.put("password", "abc1234");

		if (!myMap.containsKey("gender")) {
			myMap.put("gender", "����");
		}

		Set<String> mySet = myMap.keySet();

		for (String key : mySet) {
			String value = myMap.get(key);
			System.out.println("Ű : " + key + " �� : " + value);
		}

		System.out.println("��� ũ�� : " + myMap.size());

		System.out.println(myMap);
	}
}