package pkg12;

import java.util.Random;

public class RandomCreator extends Thread {
	
	
	Random random = new Random();
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 30; i++) {
				int rnd = random.nextInt(45)+1;
				System.out.println("·£´ý °ª : " + rnd);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
