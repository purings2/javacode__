package pkg15;

public class PersonThread extends Thread {
	public PersonThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String threadName = super.getName();
		System.out.println(threadName + "¥‘¿« æ≤∑πµÂ Ω√¿€!");
		
		try {
			String videoName = VideoShop.vshop.lendVideo();
			System.out.println(threadName + "¥‘¿Ã " + videoName + "(¿ª)∏¶ ∫Ù∏≥¥œ¥Ÿ.");
			
			int lendtime = 3000;
			System.out.println(threadName + "¥‘¿Ã " + videoName + "(¿ª)∏¶ " + (lendtime/1000) + "√  ∫Ù∏≤" );
			Thread.sleep(lendtime);
			
			System.out.println(threadName + "¥‘¿Ã " + videoName + "(¿ª)∏¶ π›≥≥«’¥œ¥Ÿ.");
			VideoShop.vshop.returnVideo(videoName);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(threadName + "¥‘¿« æ≤∑πµÂ ≥°!");
		System.out.println("=============================");
	}

}
