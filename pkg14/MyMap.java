package pkg14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "�Ｚ");
		map.put(2, "���");
		map.put(3, "�Ե�");
		map.put(4, "SK");
		
		map.put(4, "�ؼ�"); //������ Ű�� ���� �������̵��ȴ�.
		
		boolean bool = map.containsKey("6") ;
		System.out.println("Ű Ȯ�� : " + bool);
		
		bool = map.containsValue("�ؼ�") ;
		System.out.println("�ؼ� Ȯ�� : " + bool);
		
		//5���� �ִ� �� Ȯ���ϰ�, ���ٸ� "LG"�� �߰��غ�����.
		if (!map.containsKey(5)) {
			map.put(5, "LG");
		}
		
		Set<Integer> keylist = map.keySet();
		
		for(Integer key : keylist) {
			String value = map.get(key);
			System.out.println("Ű : " + key + ", �� :" + value);
		}
		
		map.clear();
		
		System.out.println("��� ũ�� : " + map.size());
		System.out.println(map);
		
	}
}
