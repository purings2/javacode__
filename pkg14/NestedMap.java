package pkg14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NestedMap {
	public static void main(String[] args) {
		// 민주당 : 강감찬, 박영희
		// 한국당 : 홍길동, 이순신, 김유신
		// 정의당 : 신사임당, 임꺽정

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		List<String> list01 = new ArrayList<String>();
		list01.add("강감찬");
		list01.add("박영희");
		map.put("민주당", list01);

		List<String> list02 = new ArrayList<String>();
		list02.add("홍길동");
		list02.add("이순신");
		list02.add("김유신");
		map.put("한국당", list02);

		List<String> list03 = new ArrayList<String>();
		list03.add("신사임당");
		list03.add("임꺽정");
		map.put("정의당", list03);

		System.out.println(map);

		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			List<String> imsilist = map.get(key);
//			System.out.println(imsilist);
			System.out.println(key + " 당원 목록");
			for (String item : imsilist) {
				System.out.println(item);
			}
			System.out.println("--------------------------------------");

		}

	}
}