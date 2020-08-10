package pkg12;

public class ATM implements Runnable {
	private int balance;

	public ATM(int balance) {
		this.balance = balance;
		System.out.println("최초 금액 : " + this.balance);
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(2000);

				int money = (int) (100 * Math.random()) + 1;

				if (this.balance >= money && money != 0) {
					withdraw(money); // 인출하기
				} else {
					// 잔액 부족
					String imsi = Thread.currentThread().getName() + "(이)가";
					imsi += money + "원 인출 실패";
					System.out.println(imsi);

					System.out.println("이유 : 잔액 부족");
					System.out.println("현재 잔액 : " + balance);
					System.out.println("인출 요구액 : " + money);

					return;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void withdraw(int money) {// 인출 메소드
		this.balance -= money;

		String imsi = Thread.currentThread().getName() + "(이)가 " + money;
		imsi += "원을 인출하여 통장 잔액이 " + this.balance + "입니다.";

		System.out.println(imsi);
	}

}
