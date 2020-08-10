package pkg11;

import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR) ;
		int month = cal.get(Calendar.MONTH) + 1 ;
		int day = cal.get(Calendar.DAY_OF_MONTH) ;
		
		int ampm = cal.get(Calendar.AM_PM) ;
		String sampm = ampm == 1 ? "����" : "����" ;
		int hour = cal.get(Calendar.HOUR) ;
		int minute = cal.get(Calendar.MINUTE) ;
		int second = cal.get(Calendar.SECOND) ;
		
		String imsi = "������ " + year + "�� " + month + "�� " + day + "�� " + sampm + " " + hour + "�� " + minute + "�� " + second + "���Դϴ�.";
		System.out.println(imsi);

	}

}
