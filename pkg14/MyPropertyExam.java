package pkg14;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("id", "hong");
		prop.put("name", "ȫ�浿");
		prop.put("password", "1234");
		prop.put("address", "������ ������");
		prop.put("zipcode", "12345");
		
		System.out.println("��� ���� : " + prop.size());
		
		String id = prop.getProperty("id");
		System.out.println( id );
		
		//hphong �׸��� �ִ��� Ȯ���ϰ�, ���ٸ� �߰��ϼ���.
		
		if(prop.getProperty("hphone") == null) {
			prop.put("hphone", "12345678") ;
		}
		
		String hphone = prop.getProperty("hphone");
		System.out.println( hphone );
		System.out.println();
		
		Enumeration enu = prop.keys();		
		while(enu.hasMoreElements()) {
			Object property = enu.nextElement();
//			System.out.println(property);
			String key = (String)property;
			String value = prop.getProperty(key);
			
			System.out.println(property + "/" + value);
		}
		
		System.out.println();
		System.out.println(prop.toString());
		
		System.out.println();
		prop.list(System.out);
	}
}