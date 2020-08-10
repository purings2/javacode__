package pkg15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//ReadFile : 2�� �������� ���� ������ ������ �о ����Ϳ� ����ϴ� ������
//news.txt
public class ReadFile implements Runnable {
	@Override
	public void run() {
		String pathname = "c:\\imsi2\\news.txt";
		File file = new File(pathname);

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			if (file.isFile()) {
				String str = "";
				while ((str = br.readLine()) != null) {
					Thread.sleep(2000);
					System.out.println(str);
				}
			}

			System.out.println("���� �б� ����");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
