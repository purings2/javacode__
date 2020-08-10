package pkg14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {

		String pathname = "c://imsi//result.txt";
		File target = new File(pathname);

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(target);
			bw = new BufferedWriter(fw);

			String[] imsi = { "대한민국", "hello", "1234" };
			for (String item : imsi) {
				bw.write(item);
				bw.newLine();
			}
			System.out.println("파일 저장 완료");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}