package pkg14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		// fileReader, BufferedReader
		// jumsu.txt : 점수 정보가 있는 파일
		String pathname = "c:\\imsi2\\jumsu.txt";
		File source = new File(pathname);

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr);

			// 여기에 무언가를 합시다.
			String imsi = ""; // 임시 변수
			while ((imsi = br.readLine()) != null) {
				MakeData(imsi);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void MakeData(String raw) {
		String[] arr = raw.split(",");
//		System.out.println(Arrays.toString(arr));
//		System.out.println();
		
		String name = arr[0];
		double kor = Double.parseDouble(arr[1]);
		double eng = Double.parseDouble(arr[2]);
		double math = Double.parseDouble(arr[3]);
		String gender = arr[4];
		
		System.out.println(gender.equalsIgnoreCase("f"));
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("성별 : " + gender);
		System.out.println();
		
	}
}