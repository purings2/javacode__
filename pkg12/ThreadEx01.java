package pkg12;

public class ThreadEx01 {

	public static void main(String[] args) {
		// UserCalendar Ŭ������ ����Ͽ� ���� �ð� ����ϱ�
		// ���� �ð� : ���� OO�� OO�� OO��
		System.out.println("main ������ ����");
		
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
		
		
		System.out.println("main ������ ��");
	}
}
