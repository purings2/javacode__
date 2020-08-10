package pkg15;

public class videoMain {

	public static void main(String[] args) {
		String[] twopm = { "닉쿤", "찬성", "택연", "우영" };

		PersonThread[] person = new PersonThread[twopm.length];
		for (int i = 0; i < person.length; i++) {
			person[i] = new PersonThread(twopm[i]);
		}
		for (int i = 0; i < person.length; i++) {
			person[i].start();
		}
	}
}