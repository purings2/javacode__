package pkg12;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadEx soo = new ThreadEx("Ã¶¼ö");
		soo.start();
		new ThreadEx("¿µÈñ").start();
		
		RunnableEx mrun = new RunnableEx() ;
		Thread th = new Thread(mrun) ;
		th.start();
	}

}
