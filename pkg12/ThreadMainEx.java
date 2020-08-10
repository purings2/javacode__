package pkg12;

public class ThreadMainEx {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		int count = Thread.currentThread().activeCount();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("쓰레드 아이디 : " + id);
		System.out.println("쓰레드 이름 : " + name);
		System.out.println("쓰레드 우선 순위 값 : " + priority);
		System.out.println("구동중인 쓰레드 갯수 : " + count);
		System.out.println("쓰레드 상태 : " + s);
		

	}

}
