package pkg15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//ReadFile : 2초 간격으로 라인 단위로 파일을 읽어서 모니터에 출력하는 스레드
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

			System.out.println("파일 읽기 종료");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("기타 예외 발생");
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
