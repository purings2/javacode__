package pkg15;

public class PersonThread extends Thread {
	public PersonThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String threadName = super.getName();
		System.out.println(threadName + "���� ������ ����!");
		
		try {
			String videoName = VideoShop.vshop.lendVideo();
			System.out.println(threadName + "���� " + videoName + "(��)�� �����ϴ�.");
			
			int lendtime = 3000;
			System.out.println(threadName + "���� " + videoName + "(��)�� " + (lendtime/1000) + "�� ����" );
			Thread.sleep(lendtime);
			
			System.out.println(threadName + "���� " + videoName + "(��)�� �ݳ��մϴ�.");
			VideoShop.vshop.returnVideo(videoName);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(threadName + "���� ������ ��!");
		System.out.println("=============================");
	}

}
