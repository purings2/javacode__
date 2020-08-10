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
		String sampm = ampm == 1 ? "오후" : "오전" ;
		int hour = cal.get(Calendar.HOUR) ;
		int minute = cal.get(Calendar.MINUTE) ;
		int second = cal.get(Calendar.SECOND) ;
		
		String imsi = "지금은 " + year + "년 " + month + "월 " + day + "일 " + sampm + " " + hour + "시 " + minute + "분 " + second + "초입니다.";
		System.out.println(imsi);

	}

}
