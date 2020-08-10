package pkg12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx extends Thread {
// 3초 간격으로 100번만 현재 시각을 출력한다.
// Thread를 상속 받는다.
	public ThreadEx(String name) {
		super(name);
	}

//	Calendar cal = Calendar.getInstance();
//	
//	int hour = cal.get(Calendar.HOUR);
//	int minute = cal.get(Calendar.MINUTE);
//	int second = cal.get(Calendar.SECOND);
//	int ampm = cal.get(Calendar.AM_PM);
//	String sampm = ampm == 0 ? "오전" : "오후" ;
//	
//	String imsi = "현재 시각 " + sampm + " " + hour + "시 " + minute + "분 " + second + "초 입니다." ;

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			Date date = new Date();
			String pattern = super.getName() + " 쓰레드 현재 시각 : hh시 mm분 ss초";
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
