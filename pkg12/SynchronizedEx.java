package pkg12;

public class SynchronizedEx {
	public static void main(String[] args) {
		int inputmoney = 1000; // ���� �Աݾ�

		ATM atm = new ATM(inputmoney);

		Thread soo = new Thread(atm, "��ö��");
		Thread hee = new Thread(atm, "�ڿ���");

		soo.start();
		hee.start();
	}
}
