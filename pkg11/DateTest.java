package pkg11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		String format = "yy�� MM�� dd�� hh�� mm�� ss��";

		// SimpleDateFormat : ��¥�� ���� ������ �����ϰ� ���ִ� Ŭ����
		SimpleDateFormat sdf1 = new SimpleDateFormat(format);
		String now = sdf1.format(date);
		System.out.println(now);
		
		format = "������ yyyy�� MM�� dd���̰�, E�����̸� " ;
		format += "���ؿ��� D��° ���̸�, ���� w��° ���Դϴ�." ;
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		now = sdf2.format(date);
		System.out.println(now);
	}

}
