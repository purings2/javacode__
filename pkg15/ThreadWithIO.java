package pkg15;

public class ThreadWithIO {
	public static void main(String[] args) {
		ReadFile mfile = new ReadFile();
		
		Thread myfile = new Thread(mfile);
		myfile.start();
		
	
		MakeFile mkdir = new MakeFile();
		mkdir.start();
		
		
	}
}