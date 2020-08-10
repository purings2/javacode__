package pkg14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NestedMap {
	public static void main(String[] args) {
		// ���ִ� : ������, �ڿ���
		// �ѱ��� : ȫ�浿, �̼���, ������
		// ���Ǵ� : �Ż��Ӵ�, �Ӳ���

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		List<String> list01 = new ArrayList<String>();
		list01.add("������");
		list01.add("�ڿ���");
		map.put("���ִ�", list01);

		List<String> list02 = new ArrayList<String>();
		list02.add("ȫ�浿");
		list02.add("�̼���");
		list02.add("������");
		map.put("�ѱ���", list02);

		List<String> list03 = new ArrayList<String>();
		list03.add("�Ż��Ӵ�");
		list03.add("�Ӳ���");
		map.put("���Ǵ�", list03);

		System.out.println(map);

		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			List<String> imsilist = map.get(key);
//			System.out.println(imsilist);
			System.out.println(key + " ��� ���");
			for (String item : imsilist) {
				System.out.println(item);
			}
			System.out.println("--------------------------------------");

		}

	}
}