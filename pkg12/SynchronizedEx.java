package pkg12;

public class SynchronizedEx {
	public static void main(String[] args) {
		int inputmoney = 1000; // ÃÖÃÊ ÀÔ±İ¾×

		ATM atm = new ATM(inputmoney);

		Thread soo = new Thread(atm, "±èÃ¶¼ö");
		Thread hee = new Thread(atm, "¹Ú¿µÈñ");

		soo.start();
		hee.start();
	}
}
