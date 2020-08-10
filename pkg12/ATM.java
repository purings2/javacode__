package pkg12;

public class ATM implements Runnable {
	private int balance;

	public ATM(int balance) {
		this.balance = balance;
		System.out.println("���� �ݾ� : " + this.balance);
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(2000);

				int money = (int) (100 * Math.random()) + 1;

				if (this.balance >= money && money != 0) {
					withdraw(money); // �����ϱ�
				} else {
					// �ܾ� ����
					String imsi = Thread.currentThread().getName() + "(��)��";
					imsi += money + "�� ���� ����";
					System.out.println(imsi);

					System.out.println("���� : �ܾ� ����");
					System.out.println("���� �ܾ� : " + balance);
					System.out.println("���� �䱸�� : " + money);

					return;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void withdraw(int money) {// ���� �޼ҵ�
		this.balance -= money;

		String imsi = Thread.currentThread().getName() + "(��)�� " + money;
		imsi += "���� �����Ͽ� ���� �ܾ��� " + this.balance + "�Դϴ�.";

		System.out.println(imsi);
	}

}
