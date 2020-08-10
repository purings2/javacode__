package pkg15;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;

//MakeFile : 3�� �������� ������ 5�� ����� �ִ� ������
	//a5312.txt~
public class MakeFile extends Thread{
	
	String pattern = "00";
	DecimalFormat df = new DecimalFormat(pattern);
	
	@Override
	public void run() {
		try {
			File dir = new File("c:\\imsi2\\") ;
			
			
			if (dir.isDirectory()) {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(3000);
					
					Calendar now = Calendar.getInstance();
					int minute = now.get(Calendar.MINUTE);
					int second = now.get(Calendar.SECOND);
					
					String fname = String.valueOf(minute) + df.format(second);
					String filename = "a" + fname + ".txt";
					
					File myfile = new File(dir, filename);
					boolean bool = myfile.createNewFile();
					
					System.out.println("����" + filename + "������");
					
					
				}
			}
			System.out.println("�۾� ����");
		} catch(InterruptedException e) {
			System.out.println("������ ���� �߻�");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
		} 
	}
}
