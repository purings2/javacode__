package pkg14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class CorrectionDriver {
	public static void main(String[] args) {

		String pathname = "c:\\imsi\\jumsu.txt";
		File source = new File(pathname);

		String pathname2 = "c:\\imsi\\correction.txt";
		File target = new File(pathname2);

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader(source); //레퍼런스 형변환
			br = new BufferedReader(fr);

			fw = new FileWriter(target);
			bw = new BufferedWriter(fw);

			String imsi = "";

			while ((imsi = br.readLine()) != null) {
				String result = makeData(imsi);
				bw.write(result);
				bw.newLine();
			}
			
			System.out.println("파일 저장 완료");

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
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

	private static String makeData(String raw) {
		String[] data = raw.split(",");

		String name = data[0];
		double kor = Double.parseDouble(data[1]);
		double eng = Double.parseDouble(data[2]);
		double math = Double.parseDouble(data[3]);
		String _gender = data[4];

		double total = kor + eng + math ;
		double average = total / 3.0;
		
		
		String gender = "";
		
		if (_gender.equalsIgnoreCase("f")) {
			gender = "여성";
		} else {
			gender = "남성";
		}
		
		DecimalFormat df = new DecimalFormat("###.0");
		
		String imsi = name + "/" + gender + "/" + df.format(total) + "/" + df.format(average) ;
		System.out.println(imsi);
		
		return imsi ;

	}

}
