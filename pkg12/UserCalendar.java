package pkg12;

import java.util.Calendar;

public class UserCalendar {
	public UserCalendar() {
		Calendar cal = Calendar.getInstance();
		
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		String sampm = ampm == 0 ? "����" : "����";
		
		String imsi = "���� ���� : " + sampm + " " + hour + "�� " + minute + "�� " + second + "�� " ;
		
		System.out.println( imsi );
	}	
}
