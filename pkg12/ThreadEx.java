package pkg12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx extends Thread {
// 3�� �������� 100���� ���� �ð��� ����Ѵ�.
// Thread�� ��� �޴´�.
	public ThreadEx(String name) {
		super(name);
	}

//	Calendar cal = Calendar.getInstance();
//	
//	int hour = cal.get(Calendar.HOUR);
//	int minute = cal.get(Calendar.MINUTE);
//	int second = cal.get(Calendar.SECOND);
//	int ampm = cal.get(Calendar.AM_PM);
//	String sampm = ampm == 0 ? "����" : "����" ;
//	
//	String imsi = "���� �ð� " + sampm + " " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�." ;

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			Date date = new Date();
			String pattern = super.getName() + " ������ ���� �ð� : hh�� mm�� ss��";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String now = sdf.format(date);
			System.out.println(now);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
