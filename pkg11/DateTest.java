package pkg11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		String format = "yy년 MM월 dd일 hh시 mm분 ss초";

		// SimpleDateFormat : 날짜에 대한 서식을 조절하게 해주는 클래스
		SimpleDateFormat sdf1 = new SimpleDateFormat(format);
		String now = sdf1.format(date);
		System.out.println(now);
		
		format = "오늘은 yyyy년 MM월 dd일이고, E요일이며 " ;
		format += "올해에서 D번째 날이며, 올해 w번째 주입니다." ;
		SimpleDateFormat sdf2 = new SimpleDateFormat(format);
		now = sdf2.format(date);
		System.out.println(now);
	}

}
