package pkg12;

import java.util.Random;

public class RunnableEx implements Runnable{
	String[] arr = {"카라", "빅뱅", "이효리", "이문세"};
// 2초 간격으로 100번만 배열 요소의 임의의 요소를 출력한다.
// Runnable 인터페이스를 상속받아서 처리해본다.
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				String item = arr[new Random().nextInt(arr.length)];
				System.out.println("배열 요소 출력 : " + item);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
