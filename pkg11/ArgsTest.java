package pkg11;

public class ArgsTest {

	public static void main(String[] args) {
		Args arg = new Args();
		arg.x = 100 ;
		int[] arr = new int[1];
		arg.add(arg.x);
		System.out.println("���3 : " +arg.x);
		arg.add(arg);
		System.out.println("���4 : " + arg.x);
	}

}
