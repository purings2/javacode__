package pkg12;

public class ThreadEx01 {

	public static void main(String[] args) {
		// UserCalendar 클래스를 사용하여 현재 시각 출력하기
		// 현재 시각 : 오전 OO시 OO분 OO초
		System.out.println("main 쓰레드 시작");
		
		RandomCreator ran = new RandomCreator();
		ran.start();
		
		for (int i = 0; i < 30; i++) {
			new UserCalendar();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		System.out.println("main 쓰레드 끝");
	}
}
